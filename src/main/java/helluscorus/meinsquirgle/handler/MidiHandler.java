package helluscorus.meinsquirgle.handler;

import helluscorus.meinsquirgle.utility.LogHelper;

import javax.sound.midi.*;

public class MidiHandler {


    public static MidiDevice midiDevice;


    public static void init() {

        // Obtain information about all the installed synthesizers.

        MidiDevice device;
        MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
        for (int i = 0; i < infos.length; i++) {
            try {
                device = MidiSystem.getMidiDevice(infos[i]);
                LogHelper.info("Device: " + i + " " + infos[i]);
            } catch (MidiUnavailableException e) {

                LogHelper.info("Nope nope nope");
            }
        }

    }
}




