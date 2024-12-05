package androidx.collection;

import O5.C;
import P5.AbstractC1371l;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class MutableLongIntMap extends LongIntMap {
    private int growthLimit;

    public MutableLongIntMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(C.b(C.b(this._size) * 32) ^ Long.MIN_VALUE, C.b(C.b(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findFirstAvailableSlot(int i8) {
        int i9 = this._capacity;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j8 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    private final int findInsertIndex(long j8) {
        int i8;
        int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i9 = a8 ^ (a8 << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this._capacity;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i14;
            long j11 = j9 ^ (j10 * ScatterMapKt.BitmaskLsb);
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[numberOfTrailingZeros] == j8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i10);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i10);
                }
                this._size++;
                int i18 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i19 = findFirstAvailableSlot >> 3;
                long j13 = jArr2[i19];
                int i20 = (findFirstAvailableSlot & 7) << 3;
                if (((j13 >> i20) & 255) == 128) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                this.growthLimit = i18 - i8;
                jArr2[i19] = (j13 & (~(255 << i20))) | (j10 << i20);
                int i21 = this._capacity;
                int i22 = ((findFirstAvailableSlot - 7) & i21) + (i21 & 7);
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                jArr2[i23] = ((~(255 << i24)) & jArr2[i23]) | (j10 << i24);
                return ~findFirstAvailableSlot;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            AbstractC1371l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        initializeGrowth();
    }

    private final void initializeStorage(int i8) {
        int i9;
        if (i8 > 0) {
            i9 = Math.max(7, ScatterMapKt.normalizeCapacity(i8));
        } else {
            i9 = 0;
        }
        this._capacity = i9;
        initializeMetadata(i9);
        this.keys = new long[i9];
        this.values = new int[i9];
    }

    private final void resizeStorage(int i8) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.keys;
        int[] iArr = this.values;
        int i9 = this._capacity;
        initializeStorage(i8);
        long[] jArr5 = this.keys;
        int[] iArr2 = this.values;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr3[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                long j8 = jArr4[i10];
                int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
                int i11 = a8 ^ (a8 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                long j9 = i11 & 127;
                long[] jArr6 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                int i13 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i12] = (jArr6[i12] & (~(255 << i13))) | (j9 << i13);
                int i14 = this._capacity;
                int i15 = ((findFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr6[i16] = (jArr6[i16] & (~(255 << i17))) | (j9 << i17);
                jArr5[findFirstAvailableSlot] = j8;
                iArr2[findFirstAvailableSlot] = iArr[i10];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i10++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    private final void writeMetadata(int i8, long j8) {
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (j8 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (j8 << i14) | (jArr[i13] & (~(255 << i14)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            AbstractC1371l.w(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i8 = this._capacity;
            int i9 = i8 >> 3;
            long j8 = 255 << ((i8 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j8)) | j8;
        }
        initializeGrowth();
    }

    public final int getOrPut(long j8, Function0 defaultValue) {
        AbstractC3255y.i(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(j8);
        if (findKeyIndex < 0) {
            int intValue = ((Number) defaultValue.invoke()).intValue();
            put(j8, intValue);
            return intValue;
        }
        return this.values[findKeyIndex];
    }

    public final void minusAssign(long j8) {
        remove(j8);
    }

    public final void plusAssign(LongIntMap from) {
        AbstractC3255y.i(from, "from");
        putAll(from);
    }

    public final void put(long j8, int i8) {
        set(j8, i8);
    }

    public final void putAll(LongIntMap from) {
        AbstractC3255y.i(from, "from");
        long[] jArr = from.keys;
        int[] iArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            set(jArr[i11], iArr[i11]);
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final void remove(long j8) {
        int findKeyIndex = findKeyIndex(j8);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(InterfaceC1668n predicate) {
        AbstractC3255y.i(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (((Boolean) predicate.invoke(Long.valueOf(this.keys[i11]), Integer.valueOf(this.values[i11]))).booleanValue()) {
                                removeValueAt(i11);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final void removeValueAt(int i8) {
        this._size--;
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
    }

    public final void set(long j8, int i8) {
        int findInsertIndex = findInsertIndex(j8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = j8;
        this.values[findInsertIndex] = i8;
    }

    public final int trim() {
        int i8 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity < i8) {
            resizeStorage(normalizeCapacity);
            return i8 - this._capacity;
        }
        return 0;
    }

    public /* synthetic */ MutableLongIntMap(int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(long[] keys) {
        AbstractC3255y.i(keys, "keys");
        for (long j8 : keys) {
            remove(j8);
        }
    }

    public final int put(long j8, int i8, int i9) {
        int findInsertIndex = findInsertIndex(j8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            i9 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = j8;
        this.values[findInsertIndex] = i8;
        return i9;
    }

    public MutableLongIntMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean remove(long j8, int i8) {
        int findKeyIndex = findKeyIndex(j8);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != i8) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(LongSet keys) {
        AbstractC3255y.i(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        remove(jArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final void minusAssign(LongList keys) {
        AbstractC3255y.i(keys, "keys");
        long[] jArr = keys.content;
        int i8 = keys._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(jArr[i9]);
        }
    }
}
