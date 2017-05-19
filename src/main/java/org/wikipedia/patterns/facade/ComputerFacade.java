package org.wikipedia.patterns.facade;

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    private long BOOT_ADDRESS;
    private long BOOT_SECTOR;
    private int SECTOR_SIZE;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
