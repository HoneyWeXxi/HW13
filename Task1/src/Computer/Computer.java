package Computer;

import Computer.cpu.Cpu;
import Computer.keyboard.Keyboard;
import Computer.memory.Memory;
import Computer.screen.Screen;
import Computer.storage.Storage;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    private final String VENDOR;
    private final String NAME;

    public Computer(String VENDOR, String NAME,
                    Cpu cpu, Memory memory,
                    Keyboard keyboard, Screen screen,
                    Storage storage) {
        this.VENDOR = VENDOR;
        this.NAME = NAME;
        this.cpu = cpu;
        this.memory = memory;
        this.keyboard = keyboard;
        this.screen = screen;
        this.storage = storage;
    }


    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public double getWeight(){
        return cpu.getWeight() + memory.getWeight() + storage.getWeight() + keyboard.getWeight() + screen.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", storage=" + storage +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", VENDOR='" + VENDOR + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
