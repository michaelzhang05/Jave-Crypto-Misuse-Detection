package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class f {
    private static final Comparator<g> a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    static class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i2 = gVar.a - gVar2.a;
            return i2 == 0 ? gVar.f1553b - gVar2.f1553b : i2;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i2, int i3);

        public abstract boolean areItemsTheSame(int i2, int i3);

        public Object getChangePayload(int i2, int i3) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {
        private final List<g> a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1542b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1543c;

        /* renamed from: d, reason: collision with root package name */
        private final b f1544d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1545e;

        /* renamed from: f, reason: collision with root package name */
        private final int f1546f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1547g;

        c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.f1542b = iArr;
            this.f1543c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f1544d = bVar;
            this.f1545e = bVar.getOldListSize();
            this.f1546f = bVar.getNewListSize();
            this.f1547g = z;
            a();
            h();
        }

        private void a() {
            g gVar = this.a.isEmpty() ? null : this.a.get(0);
            if (gVar != null && gVar.a == 0 && gVar.f1553b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.a = 0;
            gVar2.f1553b = 0;
            gVar2.f1555d = false;
            gVar2.f1554c = 0;
            gVar2.f1556e = false;
            this.a.add(0, gVar2);
        }

        private void b(List<e> list, l lVar, int i2, int i3, int i4) {
            if (!this.f1547g) {
                lVar.b(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f1543c;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    lVar.b(i2, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f1548b++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    lVar.a(j(list, i8, true).f1548b, i2);
                    if (i7 == 4) {
                        lVar.d(i2, 1, this.f1544d.getChangePayload(i8, i6));
                    }
                } else if (i7 == 16) {
                    list.add(new e(i6, i2, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                }
            }
        }

        private void c(List<e> list, l lVar, int i2, int i3, int i4) {
            if (!this.f1547g) {
                lVar.c(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f1542b;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    lVar.c(i2 + i5, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f1548b--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    e j2 = j(list, i8, false);
                    lVar.a(i2 + i5, j2.f1548b - 1);
                    if (i7 == 4) {
                        lVar.d(j2.f1548b - 1, 1, this.f1544d.getChangePayload(i6, i8));
                    }
                } else if (i7 == 16) {
                    list.add(new e(i6, i2 + i5, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                }
            }
        }

        private void f(int i2, int i3, int i4) {
            if (this.f1542b[i2 - 1] != 0) {
                return;
            }
            g(i2, i3, i4, false);
        }

        private boolean g(int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            int i7;
            if (z) {
                i3--;
                i6 = i2;
                i5 = i3;
            } else {
                i5 = i2 - 1;
                i6 = i5;
            }
            while (i4 >= 0) {
                g gVar = this.a.get(i4);
                int i8 = gVar.a;
                int i9 = gVar.f1554c;
                int i10 = i8 + i9;
                int i11 = gVar.f1553b + i9;
                if (z) {
                    for (int i12 = i6 - 1; i12 >= i10; i12--) {
                        if (this.f1544d.areItemsTheSame(i12, i5)) {
                            i7 = this.f1544d.areContentsTheSame(i12, i5) ? 8 : 4;
                            this.f1543c[i5] = (i12 << 5) | 16;
                            this.f1542b[i12] = (i5 << 5) | i7;
                            return true;
                        }
                    }
                } else {
                    for (int i13 = i3 - 1; i13 >= i11; i13--) {
                        if (this.f1544d.areItemsTheSame(i5, i13)) {
                            i7 = this.f1544d.areContentsTheSame(i5, i13) ? 8 : 4;
                            int i14 = i2 - 1;
                            this.f1542b[i14] = (i13 << 5) | 16;
                            this.f1543c[i13] = (i14 << 5) | i7;
                            return true;
                        }
                    }
                }
                i6 = gVar.a;
                i3 = gVar.f1553b;
                i4--;
            }
            return false;
        }

        private void h() {
            int i2 = this.f1545e;
            int i3 = this.f1546f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.a;
                int i5 = gVar.f1554c;
                int i6 = i4 + i5;
                int i7 = gVar.f1553b + i5;
                if (this.f1547g) {
                    while (i2 > i6) {
                        f(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i7) {
                        i(i2, i3, size);
                        i3--;
                    }
                }
                for (int i8 = 0; i8 < gVar.f1554c; i8++) {
                    int i9 = gVar.a + i8;
                    int i10 = gVar.f1553b + i8;
                    int i11 = this.f1544d.areContentsTheSame(i9, i10) ? 1 : 2;
                    this.f1542b[i9] = (i10 << 5) | i11;
                    this.f1543c[i10] = (i9 << 5) | i11;
                }
                i2 = gVar.a;
                i3 = gVar.f1553b;
            }
        }

        private void i(int i2, int i3, int i4) {
            if (this.f1543c[i3 - 1] != 0) {
                return;
            }
            g(i2, i3, i4, true);
        }

        private static e j(List<e> list, int i2, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.a == i2 && eVar.f1549c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f1548b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public void d(l lVar) {
            androidx.recyclerview.widget.c cVar;
            if (lVar instanceof androidx.recyclerview.widget.c) {
                cVar = (androidx.recyclerview.widget.c) lVar;
            } else {
                cVar = new androidx.recyclerview.widget.c(lVar);
            }
            ArrayList arrayList = new ArrayList();
            int i2 = this.f1545e;
            int i3 = this.f1546f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.f1554c;
                int i5 = gVar.a + i4;
                int i6 = gVar.f1553b + i4;
                if (i5 < i2) {
                    c(arrayList, cVar, i5, i2 - i5, i5);
                }
                if (i6 < i3) {
                    b(arrayList, cVar, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    int[] iArr = this.f1542b;
                    int i8 = gVar.a;
                    if ((iArr[i8 + i7] & 31) == 2) {
                        cVar.d(i8 + i7, 1, this.f1544d.getChangePayload(i8 + i7, gVar.f1553b + i7));
                    }
                }
                i2 = gVar.a;
                i3 = gVar.f1553b;
            }
            cVar.e();
        }

        public void e(RecyclerView.g gVar) {
            d(new androidx.recyclerview.widget.b(gVar));
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class d<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public abstract Object c(T t, T t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class e {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1548b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1549c;

        public e(int i2, int i3, boolean z) {
            this.a = i2;
            this.f1548b = i3;
            this.f1549c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0029f {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1550b;

        /* renamed from: c, reason: collision with root package name */
        int f1551c;

        /* renamed from: d, reason: collision with root package name */
        int f1552d;

        public C0029f() {
        }

        public C0029f(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f1550b = i3;
            this.f1551c = i4;
            this.f1552d = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1553b;

        /* renamed from: c, reason: collision with root package name */
        int f1554c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1555d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1556e;

        g() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    public static c b(b bVar, boolean z) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0029f(0, oldListSize, 0, newListSize));
        int abs = oldListSize + newListSize + Math.abs(oldListSize - newListSize);
        int i2 = abs * 2;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0029f c0029f = (C0029f) arrayList2.remove(arrayList2.size() - 1);
            g c2 = c(bVar, c0029f.a, c0029f.f1550b, c0029f.f1551c, c0029f.f1552d, iArr, iArr2, abs);
            if (c2 != null) {
                if (c2.f1554c > 0) {
                    arrayList.add(c2);
                }
                c2.a += c0029f.a;
                c2.f1553b += c0029f.f1551c;
                C0029f c0029f2 = arrayList3.isEmpty() ? new C0029f() : (C0029f) arrayList3.remove(arrayList3.size() - 1);
                c0029f2.a = c0029f.a;
                c0029f2.f1551c = c0029f.f1551c;
                if (c2.f1556e) {
                    c0029f2.f1550b = c2.a;
                    c0029f2.f1552d = c2.f1553b;
                } else if (c2.f1555d) {
                    c0029f2.f1550b = c2.a - 1;
                    c0029f2.f1552d = c2.f1553b;
                } else {
                    c0029f2.f1550b = c2.a;
                    c0029f2.f1552d = c2.f1553b - 1;
                }
                arrayList2.add(c0029f2);
                if (c2.f1556e) {
                    if (c2.f1555d) {
                        int i3 = c2.a;
                        int i4 = c2.f1554c;
                        c0029f.a = i3 + i4 + 1;
                        c0029f.f1551c = c2.f1553b + i4;
                    } else {
                        int i5 = c2.a;
                        int i6 = c2.f1554c;
                        c0029f.a = i5 + i6;
                        c0029f.f1551c = c2.f1553b + i6 + 1;
                    }
                } else {
                    int i7 = c2.a;
                    int i8 = c2.f1554c;
                    c0029f.a = i7 + i8;
                    c0029f.f1551c = c2.f1553b + i8;
                }
                arrayList2.add(c0029f);
            } else {
                arrayList3.add(c0029f);
            }
        }
        Collections.sort(arrayList, a);
        return new c(bVar, arrayList, iArr, iArr2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r24[r13 - 1] < r24[r13 + r5]) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r25[r12 - 1] < r25[r12 + 1]) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1 A[LOOP:4: B:54:0x00cd->B:58:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec A[EDGE_INSN: B:59:0x00ec->B:60:0x00ec BREAK  A[LOOP:4: B:54:0x00cd->B:58:0x00e1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.recyclerview.widget.f.g c(androidx.recyclerview.widget.f.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.c(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$g");
    }
}
