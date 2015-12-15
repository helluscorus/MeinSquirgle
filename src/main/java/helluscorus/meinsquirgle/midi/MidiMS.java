package helluscorus.meinsquirgle.midi;

import helluscorus.meinsquirgle.utility.LogHelper;

import javax.sound.midi.*;

public class MidiMS {

    public static MidiDevice outputDevice;
    public static Receiver receiver;
    public static int midiDevId = 6; // this changes, find method to get input/output type and ID reliably

    public static void init() {

        MidiDevice.Info[] info = MidiSystem.getMidiDeviceInfo();
        LogHelper.info(info[midiDevId].toString());

        try {

            outputDevice = MidiSystem.getMidiDevice(info[midiDevId]);
            LogHelper.info("Trying to open MIDI Device: " + midiDevId + " " + info[midiDevId].toString() + " (" + outputDevice.toString() + ")");
            outputDevice.open();
        } catch (Exception e) {
        }

        try {
            receiver = outputDevice.getReceiver();
        } catch (Exception e) {
        }
    }

    public static void midiNote(int midiChan, int midiNote, int midiVelocity, int midiNoteLength) {

        ShortMessage myMsg = new ShortMessage();

        try {

            long timeStamp = -1;

            //LogHelper.info("Trying to send MIDI message:" + " Channel = " + (midiChan + 1) + " Note = " + midiNote);
            myMsg.setMessage(ShortMessage.NOTE_ON, midiChan, midiNote, midiVelocity);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_OFF, midiChan, midiNote, midiVelocity);
            receiver.send(myMsg, timeStamp);

        } catch (Exception e) {

            LogHelper.info("Exception on receiver.send");
        }

    }
}