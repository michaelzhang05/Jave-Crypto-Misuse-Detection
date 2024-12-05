package C5;

import C5.d;
import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1297a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final Vector a(String value) {
            int intValue;
            int intValue2;
            int intValue3;
            int intValue4;
            char c8;
            int intValue5;
            int i8;
            int intValue6;
            int intValue7;
            int intValue8;
            int intValue9;
            int intValue10;
            int intValue11;
            int intValue12;
            int intValue13;
            int intValue14;
            int intValue15;
            AbstractC3159y.i(value, "value");
            Vector vector = new Vector(null, 1, null);
            d.a aVar = d.f1293a;
            A5.c cVar = A5.c.f488a;
            A5.d dVar = A5.d.MAX_ID;
            Integer a8 = cVar.a(dVar);
            if (a8 == null) {
                intValue = 0;
            } else {
                intValue = a8.intValue();
            }
            String substring = value.substring(0, intValue);
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Integer a9 = cVar.a(dVar);
            if (a9 == null) {
                intValue2 = 0;
            } else {
                intValue2 = a9.intValue();
            }
            int a10 = aVar.a(substring, intValue2);
            Integer a11 = cVar.a(dVar);
            if (a11 == null) {
                intValue3 = 0;
            } else {
                intValue3 = a11.intValue();
            }
            String valueOf = String.valueOf(value.charAt(intValue3));
            A5.d dVar2 = A5.d.ENCODING_TYPE;
            Integer a12 = cVar.a(dVar2);
            if (a12 == null) {
                intValue4 = 0;
            } else {
                intValue4 = a12.intValue();
            }
            int a13 = aVar.a(valueOf, intValue4);
            if (a13 != 0) {
                if (a13 == 1) {
                    c8 = 2;
                } else {
                    a aVar2 = h.f1297a;
                    throw new A5.e(AbstractC3159y.q("h.h", ": Too large value to encode into VectorEncodingType"));
                }
            } else {
                c8 = 1;
            }
            Integer a14 = cVar.a(dVar2);
            if (a14 == null) {
                intValue5 = 0;
            } else {
                intValue5 = a14.intValue();
            }
            int i9 = intValue3 + intValue5;
            if (c8 == 2) {
                A5.d dVar3 = A5.d.NUM_ENTRIES;
                Integer a15 = cVar.a(dVar3);
                if (a15 == null) {
                    intValue6 = 0;
                } else {
                    intValue6 = a15.intValue();
                }
                String substring2 = value.substring(i9, intValue6);
                AbstractC3159y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Integer a16 = cVar.a(dVar3);
                if (a16 == null) {
                    intValue7 = 0;
                } else {
                    intValue7 = a16.intValue();
                }
                int a17 = aVar.a(substring2, intValue7);
                Integer a18 = cVar.a(dVar3);
                if (a18 == null) {
                    intValue8 = 0;
                } else {
                    intValue8 = a18.intValue();
                }
                i8 = i9 + intValue8;
                if (a17 >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String value2 = String.valueOf(value.charAt(i8));
                        AbstractC3159y.i(value2, "value");
                        boolean d8 = AbstractC3159y.d(value2, "1");
                        A5.c cVar2 = A5.c.f488a;
                        Integer a19 = cVar2.a(A5.d.SINGLE_OR_RANGE);
                        if (a19 == null) {
                            intValue9 = 0;
                        } else {
                            intValue9 = a19.intValue();
                        }
                        int i12 = i8 + intValue9;
                        d.a aVar3 = d.f1293a;
                        A5.d dVar4 = A5.d.VENDOR_ID;
                        Integer a20 = cVar2.a(dVar4);
                        if (a20 == null) {
                            intValue10 = 0;
                        } else {
                            intValue10 = a20.intValue();
                        }
                        String substring3 = value.substring(i12, intValue10);
                        AbstractC3159y.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Integer a21 = cVar2.a(dVar4);
                        if (a21 == null) {
                            intValue11 = 0;
                        } else {
                            intValue11 = a21.intValue();
                        }
                        int a22 = aVar3.a(substring3, intValue11);
                        Integer a23 = cVar2.a(dVar4);
                        if (a23 == null) {
                            intValue12 = 0;
                        } else {
                            intValue12 = a23.intValue();
                        }
                        i8 = i12 + intValue12;
                        if (d8) {
                            Integer a24 = cVar2.a(dVar4);
                            if (a24 == null) {
                                intValue13 = 0;
                            } else {
                                intValue13 = a24.intValue();
                            }
                            String substring4 = value.substring(i8, intValue13);
                            AbstractC3159y.h(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            Integer a25 = cVar2.a(dVar4);
                            if (a25 == null) {
                                intValue14 = 0;
                            } else {
                                intValue14 = a25.intValue();
                            }
                            int a26 = aVar3.a(substring4, intValue14);
                            Integer a27 = cVar2.a(dVar4);
                            if (a27 == null) {
                                intValue15 = 0;
                            } else {
                                intValue15 = a27.intValue();
                            }
                            i8 += intValue15;
                            if (a22 <= a26) {
                                while (true) {
                                    int i13 = a22 + 1;
                                    vector.set(a22);
                                    if (a22 == a26) {
                                        break;
                                    }
                                    a22 = i13;
                                }
                            }
                        } else {
                            vector.set(a22);
                        }
                        if (i10 == a17) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } else {
                int i14 = i9 + a10;
                String substring5 = value.substring(i9, i14);
                AbstractC3159y.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                vector = c.f1292a.a(substring5, a10);
                i8 = i14;
            }
            vector.setBitLength(i8);
            return vector;
        }
    }
}
