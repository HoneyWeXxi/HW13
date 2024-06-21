import Calculate.ArithmeticCalculator;
import Calculate.Operation;
import Computer.Computer;
import Computer.cpu.CoreCount;
import Computer.cpu.Cpu;
import Computer.cpu.Creator;
import Computer.cpu.Frequency;
import Computer.keyboard.Backlighting;
import Computer.keyboard.Keyboard;
import Computer.keyboard.KeyboardType;
import Computer.memory.Memory;
import Computer.memory.MemoryType;
import Computer.screen.Screen;
import Computer.screen.ScreenType;
import Computer.storage.Storage;
import Computer.storage.StorageType;

import javax.management.monitor.Monitor;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(Frequency.FOUR, CoreCount.FOUR, Creator.INTEL, 50);
        Memory memory = new Memory(MemoryType.DDR4, 16, 50);
        Storage storage = new Storage(StorageType.SSD,500, 150);
        Screen screen = new Screen(24,500, ScreenType.VA);
        Keyboard keyboard = new Keyboard(KeyboardType.MECH, Backlighting.NO,450);
        Computer computer = new Computer("DELL","GIGA",cpu,memory,keyboard,screen,storage);
        System.out.println(computer.getWeight());
    }
}