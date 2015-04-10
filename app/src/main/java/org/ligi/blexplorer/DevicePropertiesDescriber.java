package org.ligi.blexplorer;

import android.bluetooth.BluetoothDevice;

public class DevicePropertiesDescriber {
    public static String describeBondState(BluetoothDevice device) {
        switch (device.getBondState()) {
            case BluetoothDevice.BOND_NONE:
                return "none";
            case BluetoothDevice.BOND_BONDING:
                return "bonding";
            case BluetoothDevice.BOND_BONDED:
                return "bonded";
            default:
                return "unknown";
        }
    }

    public static String describeType(BluetoothDevice device) {
        switch (device.getType()) {
            case BluetoothDevice.DEVICE_TYPE_CLASSIC:
                return "classic";
            case BluetoothDevice.DEVICE_TYPE_DUAL:
                return "dual";
            case BluetoothDevice.DEVICE_TYPE_LE:
                return "LE";
            default:
            case BluetoothDevice.DEVICE_TYPE_UNKNOWN:
                return "unknown";
        }
    }
}