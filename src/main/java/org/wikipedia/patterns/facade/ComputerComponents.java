package org.wikipedia.patterns.facade;

import java.util.Arrays;

class CPU {
    public void freeze() {
        System.out.println(this.getClass().getCanonicalName() + " freeze()");
    }

    public void jump(long position) {
        System.out.println(this.getClass().getCanonicalName() + " jump(): position=" + position);
    }

    public void execute() {
        System.out.println(this.getClass().getCanonicalName() + " execute()");
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println(this.getClass().getCanonicalName() + " read(): lba=" + lba + ", size=" + size);
        return new byte[0];
    }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println(this.getClass().getCanonicalName() + " load(): position=" + position + ", data=" + Arrays.toString(data));
    }
}

