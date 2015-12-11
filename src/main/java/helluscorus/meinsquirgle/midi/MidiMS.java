package helluscorus.meinsquirgle.midi;

import helluscorus.meinsquirgle.utility.LogHelper;

import javax.sound.midi.*;

public class MidiMS {

    public static MidiDevice outputDevice;
    public static Receiver receiver;
    public static int midiDevId = 14; // this changes, find method to get input/output type and ID reliably

    public static void init() {

        MidiDevice.Info[] info = MidiSystem.getMidiDeviceInfo();
        LogHelper.info(info[midiDevId].toString());

        try {

            outputDevice = MidiSystem.getMidiDevice(info[midiDevId]);
            LogHelper.info("Trying to open MIDI Device: " + midiDevId + " " + outputDevice.toString());
            outputDevice.open();
        } catch (Exception e) {
        }

        try {
            receiver = outputDevice.getReceiver();
        } catch (Exception e) {
        }
    }

    public static void midiNote() {

        ShortMessage myMsg = new ShortMessage();

        try {
            long timeStamp = -1;


            myMsg.setMessage(ShortMessage.NOTE_ON, 0, 60, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_OFF, 0, 60, 127);


        } catch (
                Exception e
                )

        {
        }

    }
}