package questao5;
public class Main {
    public static void main(String[] args) {
        questao5.BluetoothPacotes bluetoothPacotes = new questao5.BluetoothPacotes();
        bluetoothPacotes.iniciarConexao();
        bluetoothPacotes.processarDados();
        bluetoothPacotes.encerrarConexao();
        questao5.BluetoothSerial bluetoothSerial = new questao5.BluetoothSerial();
        bluetoothSerial.iniciarConexao();
        bluetoothSerial.processarDados();
        bluetoothSerial.encerrarConexao();
    }

}