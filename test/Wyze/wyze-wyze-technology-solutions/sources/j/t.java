package j;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* compiled from: Options.kt */
/* loaded from: classes2.dex */
public final class t extends AbstractList<i> implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final a f19387g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final i[] f19388h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f19389i;

    /* compiled from: Options.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        private final void a(long j2, f fVar, int i2, List<? extends i> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            f fVar2;
            int i9 = i2;
            if (i3 < i4) {
                for (int i10 = i3; i10 < i4; i10++) {
                    if (!(list.get(i10).P() >= i9)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = list.get(i3);
                i iVar2 = list.get(i4 - 1);
                if (i9 == iVar.P()) {
                    int intValue = list2.get(i3).intValue();
                    int i11 = i3 + 1;
                    i iVar3 = list.get(i11);
                    i5 = i11;
                    i6 = intValue;
                    iVar = iVar3;
                } else {
                    i5 = i3;
                    i6 = -1;
                }
                if (iVar.r(i9) != iVar2.r(i9)) {
                    int i12 = 1;
                    for (int i13 = i5 + 1; i13 < i4; i13++) {
                        if (list.get(i13 - 1).r(i9) != list.get(i13).r(i9)) {
                            i12++;
                        }
                    }
                    long c2 = j2 + c(fVar) + 2 + (i12 * 2);
                    fVar.writeInt(i12);
                    fVar.writeInt(i6);
                    for (int i14 = i5; i14 < i4; i14++) {
                        byte r = list.get(i14).r(i9);
                        if (i14 == i5 || r != list.get(i14 - 1).r(i9)) {
                            fVar.writeInt(r & 255);
                        }
                    }
                    f fVar3 = new f();
                    while (i5 < i4) {
                        byte r2 = list.get(i5).r(i9);
                        int i15 = i5 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 >= i4) {
                                i7 = i4;
                                break;
                            } else {
                                if (r2 != list.get(i16).r(i9)) {
                                    i7 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        if (i15 == i7 && i9 + 1 == list.get(i5).P()) {
                            fVar.writeInt(list2.get(i5).intValue());
                            i8 = i7;
                            fVar2 = fVar3;
                        } else {
                            fVar.writeInt(((int) (c2 + c(fVar3))) * (-1));
                            i8 = i7;
                            fVar2 = fVar3;
                            a(c2, fVar3, i9 + 1, list, i5, i7, list2);
                        }
                        fVar3 = fVar2;
                        i5 = i8;
                    }
                    fVar.V(fVar3);
                    return;
                }
                int min = Math.min(iVar.P(), iVar2.P());
                int i17 = 0;
                for (int i18 = i9; i18 < min && iVar.r(i18) == iVar2.r(i18); i18++) {
                    i17++;
                }
                long c3 = j2 + c(fVar) + 2 + i17 + 1;
                fVar.writeInt(-i17);
                fVar.writeInt(i6);
                int i19 = i9 + i17;
                while (i9 < i19) {
                    fVar.writeInt(iVar.r(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (i19 == list.get(i5).P()) {
                        fVar.writeInt(list2.get(i5).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar4 = new f();
                fVar.writeInt(((int) (c(fVar4) + c3)) * (-1));
                a(c3, fVar4, i19, list, i5, i4, list2);
                fVar.V(fVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j2, f fVar, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            aVar.a((i5 & 1) != 0 ? 0L : j2, fVar, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long c(f fVar) {
            return fVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final j.t d(j.i... r17) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j.t.a.d(j.i[]):j.t");
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public /* synthetic */ t(i[] iVarArr, int[] iArr, kotlin.jvm.internal.g gVar) {
        this(iVarArr, iArr);
    }

    public static final t J(i... iVarArr) {
        return f19387g.d(iVarArr);
    }

    public /* bridge */ int D(i iVar) {
        return super.lastIndexOf(iVar);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: a */
    public int getF22037i() {
        return this.f19388h.length;
    }

    public /* bridge */ boolean b(i iVar) {
        return super.contains(iVar);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return b((i) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i get(int i2) {
        return this.f19388h[i2];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return z((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return D((i) obj);
        }
        return -1;
    }

    public final i[] w() {
        return this.f19388h;
    }

    public final int[] x() {
        return this.f19389i;
    }

    public /* bridge */ int z(i iVar) {
        return super.indexOf(iVar);
    }

    private t(i[] iVarArr, int[] iArr) {
        this.f19388h = iVarArr;
        this.f19389i = iArr;
    }
}
