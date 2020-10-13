package mips;

import jfig.utils.SetupManager;
import hades.gui.Editor;
import java.util.Timer;
import java.util.TimerTask;
import jfig.utils.SetupManager;

public class MIPS {

    private Editor mainEditor;

    private MIPS() {
        SetupManager.loadGlobalProperties("hades/.hadesrc");
        SetupManager.setProperty("Hades.Editor.AutoStartSimulation", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayInstanceBorder", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayInstanceLabels", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayClassLabels", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayPortSymbols", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayPortLabels", "true");
        SetupManager.setProperty("Hades.LayerTable.DisplayBusPortSymbols", "true");
        SetupManager.setProperty("Hades.LayerTable.RtlibAnimation", "true");
        SetupManager.setProperty("Hades.Editor.EnableToolTips", "true");
        SetupManager.setProperty("Hades.Editor.PopupMenuResource", "/mips/base/PopupMenu.txt");
        mainEditor = new Editor(true);
    }

    public static void main(String[] args) {
        MIPS mips = new MIPS();

    }

}
