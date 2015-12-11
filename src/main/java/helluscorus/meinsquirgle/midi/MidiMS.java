package helluscorus.meinsquirgle.midi;

import helluscorus.meinsquirgle.utility.LogHelper;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class MidiMS {


    public static void init() {

        MidiDevice outputDevice = null;
        Receiver receiver = null;

        MidiDevice.Info[] info = MidiSystem.getMidiDeviceInfo();
        LogHelper.info(info[7].toString());

        try {

            outputDevice = MidiSystem.getMidiDevice(info[14]);
            LogHelper.info("Trying to open MIDI Device: " + 14 + " " + outputDevice.toString());
            outputDevice.open();
        } catch (Exception e) {
        }

        try {
            receiver = outputDevice.getReceiver();
        } catch (Exception e) {
        }

        ShortMessage myMsg = new ShortMessage();

        try {
            long timeStamp = -1;

            myMsg.setMessage(ShortMessage.NOTE_ON, 0, 60, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_ON, 0, 63, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_ON, 0, 67, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_OFF, 0, 60, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_OFF, 0, 63, 127);
            receiver.send(myMsg, timeStamp);
            myMsg.setMessage(ShortMessage.NOTE_OFF, 0, 67, 127);
            receiver.send(myMsg, timeStamp);

        } catch (Exception e) {
        }
    }
}