package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class Constraints {
    private static final long FocusMask = 3;
    public static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3;
    private static final long MaxFocusWidth = 1;
    private static final int MaxNonFocusBits = 13;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2;
    private static final int MinFocusMask = 65535;
    private static final long MinFocusWidth = 0;
    private static final int MinNonFocusBits = 15;
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int MaxFocusMask = 262143;
    private static final int MinNonFocusMask = 32767;
    private static final int MaxNonFocusMask = 8191;
    private static final int[] WidthMask = {65535, MaxFocusMask, MinNonFocusMask, MaxNonFocusMask};
    private static final int[] HeightMask = {MinNonFocusMask, MaxNonFocusMask, 65535, MaxFocusMask};

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final int bitsNeedForSize(int i8) {
            if (i8 < Constraints.MaxNonFocusMask) {
                return 13;
            }
            if (i8 < Constraints.MinNonFocusMask) {
                return 15;
            }
            if (i8 < 65535) {
                return 16;
            }
            if (i8 < Constraints.MaxFocusMask) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i8 + " in Constraints");
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
        public final long m5158createConstraintsZbe2FdA$ui_unit_release(int i8, int i9, int i10, int i11) {
            int i12;
            int i13;
            long j8;
            int i14;
            if (i11 == Integer.MAX_VALUE) {
                i12 = i10;
            } else {
                i12 = i11;
            }
            int bitsNeedForSize = bitsNeedForSize(i12);
            if (i9 == Integer.MAX_VALUE) {
                i13 = i8;
            } else {
                i13 = i9;
            }
            int bitsNeedForSize2 = bitsNeedForSize(i13);
            if (bitsNeedForSize + bitsNeedForSize2 <= 31) {
                if (bitsNeedForSize2 != 13) {
                    if (bitsNeedForSize2 != 18) {
                        if (bitsNeedForSize2 != 15) {
                            if (bitsNeedForSize2 == 16) {
                                j8 = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j8 = Constraints.MinFocusHeight;
                        }
                    } else {
                        j8 = Constraints.MaxFocusWidth;
                    }
                } else {
                    j8 = 3;
                }
                int i15 = 0;
                if (i9 == Integer.MAX_VALUE) {
                    i14 = 0;
                } else {
                    i14 = i9 + 1;
                }
                if (i11 != Integer.MAX_VALUE) {
                    i15 = i11 + 1;
                }
                int i16 = Constraints.MinHeightOffsets[(int) j8];
                return Constraints.m5140constructorimpl((i14 << 33) | j8 | (i8 << Constraints.MinFocusHeight) | (i10 << i16) | (i15 << (i16 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i13 + " and height of " + i12 + " in Constraints");
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m5159fixedJhjzzOo(int i8, int i9) {
            if (i8 >= 0 && i9 >= 0) {
                return m5158createConstraintsZbe2FdA$ui_unit_release(i8, i8, i9, i9);
            }
            throw new IllegalArgumentException(("width(" + i8 + ") and height(" + i9 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m5160fixedHeightOenEA2s(int i8) {
            if (i8 >= 0) {
                return m5158createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, i8, i8);
            }
            throw new IllegalArgumentException(("height(" + i8 + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m5161fixedWidthOenEA2s(int i8) {
            if (i8 >= 0) {
                return m5158createConstraintsZbe2FdA$ui_unit_release(i8, i8, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i8 + ") must be >= 0").toString());
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Constraints(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m5139boximpl(long j8) {
        return new Constraints(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5140constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m5141copyZbe2FdA(long j8, int i8, int i9, int i10, int i11) {
        if (i10 >= 0 && i8 >= 0) {
            if (i9 < i8 && i9 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= minWidth(" + i8 + ')').toString());
            }
            if (i11 < i10 && i11 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= minHeight(" + i10 + ')').toString());
            }
            return Companion.m5158createConstraintsZbe2FdA$ui_unit_release(i8, i9, i10, i11);
        }
        throw new IllegalArgumentException(("minHeight(" + i10 + ") and minWidth(" + i8 + ") must be >= 0").toString());
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m5142copyZbe2FdA$default(long j8, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = m5153getMinWidthimpl(j8);
        }
        int i13 = i8;
        if ((i12 & 2) != 0) {
            i9 = m5151getMaxWidthimpl(j8);
        }
        int i14 = i9;
        if ((i12 & 4) != 0) {
            i10 = m5152getMinHeightimpl(j8);
        }
        int i15 = i10;
        if ((i12 & 8) != 0) {
            i11 = m5150getMaxHeightimpl(j8);
        }
        return m5141copyZbe2FdA(j8, i13, i14, i15, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5143equalsimpl(long j8, Object obj) {
        return (obj instanceof Constraints) && j8 == ((Constraints) obj).m5157unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5144equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m5145getFocusIndeximpl(long j8) {
        return (int) (j8 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m5146getHasBoundedHeightimpl(long j8) {
        int m5145getFocusIndeximpl = m5145getFocusIndeximpl(j8);
        if ((((int) (j8 >> (MinHeightOffsets[m5145getFocusIndeximpl] + 31))) & HeightMask[m5145getFocusIndeximpl]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m5147getHasBoundedWidthimpl(long j8) {
        if ((((int) (j8 >> 33)) & WidthMask[m5145getFocusIndeximpl(j8)]) != 0) {
            return true;
        }
        return false;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m5148getHasFixedHeightimpl(long j8) {
        if (m5150getMaxHeightimpl(j8) == m5152getMinHeightimpl(j8)) {
            return true;
        }
        return false;
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m5149getHasFixedWidthimpl(long j8) {
        if (m5151getMaxWidthimpl(j8) == m5153getMinWidthimpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m5150getMaxHeightimpl(long j8) {
        int m5145getFocusIndeximpl = m5145getFocusIndeximpl(j8);
        int i8 = ((int) (j8 >> (MinHeightOffsets[m5145getFocusIndeximpl] + 31))) & HeightMask[m5145getFocusIndeximpl];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m5151getMaxWidthimpl(long j8) {
        int i8 = ((int) (j8 >> 33)) & WidthMask[m5145getFocusIndeximpl(j8)];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m5152getMinHeightimpl(long j8) {
        int m5145getFocusIndeximpl = m5145getFocusIndeximpl(j8);
        return ((int) (j8 >> MinHeightOffsets[m5145getFocusIndeximpl])) & HeightMask[m5145getFocusIndeximpl];
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m5153getMinWidthimpl(long j8) {
        return ((int) (j8 >> MinFocusHeight)) & WidthMask[m5145getFocusIndeximpl(j8)];
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5154hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m5155isZeroimpl(long j8) {
        if (m5151getMaxWidthimpl(j8) != 0 && m5150getMaxHeightimpl(j8) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5156toStringimpl(long j8) {
        String valueOf;
        int m5151getMaxWidthimpl = m5151getMaxWidthimpl(j8);
        String str = "Infinity";
        if (m5151getMaxWidthimpl == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(m5151getMaxWidthimpl);
        }
        int m5150getMaxHeightimpl = m5150getMaxHeightimpl(j8);
        if (m5150getMaxHeightimpl != Integer.MAX_VALUE) {
            str = String.valueOf(m5150getMaxHeightimpl);
        }
        return "Constraints(minWidth = " + m5153getMinWidthimpl(j8) + ", maxWidth = " + valueOf + ", minHeight = " + m5152getMinHeightimpl(j8) + ", maxHeight = " + str + ')';
    }

    public boolean equals(Object obj) {
        return m5143equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5154hashCodeimpl(this.value);
    }

    public String toString() {
        return m5156toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5157unboximpl() {
        return this.value;
    }
}
