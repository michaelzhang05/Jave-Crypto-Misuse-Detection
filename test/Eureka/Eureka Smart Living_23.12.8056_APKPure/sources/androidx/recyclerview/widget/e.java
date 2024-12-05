package androidx.recyclerview.widget;

import androidx.core.os.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal f3557e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    static Comparator f3558f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f3560b;

    /* renamed from: c, reason: collision with root package name */
    long f3561c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f3559a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3562d = new ArrayList();

    /* loaded from: classes.dex */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3570d;
            if ((recyclerView == null) != (cVar2.f3570d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z5 = cVar.f3567a;
            if (z5 != cVar2.f3567a) {
                return z5 ? -1 : 1;
            }
            int i6 = cVar2.f3568b - cVar.f3568b;
            if (i6 != 0) {
                return i6;
            }
            int i7 = cVar.f3569c - cVar2.f3569c;
            if (i7 != 0) {
                return i7;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f3563a;

        /* renamed from: b, reason: collision with root package name */
        int f3564b;

        /* renamed from: c, reason: collision with root package name */
        int[] f3565c;

        /* renamed from: d, reason: collision with root package name */
        int f3566d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i6, int i7) {
            if (i6 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i8 = this.f3566d * 2;
            int[] iArr = this.f3565c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3565c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int[] iArr3 = new int[i8 * 2];
                this.f3565c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3565c;
            iArr4[i8] = i6;
            iArr4[i8 + 1] = i7;
            this.f3566d++;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f3565c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3566d = 0;
        }

        void c(RecyclerView recyclerView, boolean z5) {
            this.f3566d = 0;
            int[] iArr = this.f3565c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f3274m;
            if (recyclerView.f3272l == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z5) {
                if (!recyclerView.f3256d.p()) {
                    oVar.p(recyclerView.f3272l.c(), this);
                }
            } else if (!recyclerView.l0()) {
                oVar.o(this.f3563a, this.f3564b, recyclerView.f3263g0, this);
            }
            int i6 = this.f3566d;
            if (i6 > oVar.f3354m) {
                oVar.f3354m = i6;
                oVar.f3355n = z5;
                recyclerView.f3252b.K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i6) {
            if (this.f3565c != null) {
                int i7 = this.f3566d * 2;
                for (int i8 = 0; i8 < i7; i8 += 2) {
                    if (this.f3565c[i8] == i6) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i6, int i7) {
            this.f3563a = i6;
            this.f3564b = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3567a;

        /* renamed from: b, reason: collision with root package name */
        public int f3568b;

        /* renamed from: c, reason: collision with root package name */
        public int f3569c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f3570d;

        /* renamed from: e, reason: collision with root package name */
        public int f3571e;

        c() {
        }

        public void a() {
            this.f3567a = false;
            this.f3568b = 0;
            this.f3569c = 0;
            this.f3570d = null;
            this.f3571e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f3559a.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView = (RecyclerView) this.f3559a.get(i7);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3261f0.c(recyclerView, false);
                i6 += recyclerView.f3261f0.f3566d;
            }
        }
        this.f3562d.ensureCapacity(i6);
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3559a.get(i9);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f3261f0;
                int abs = Math.abs(bVar.f3563a) + Math.abs(bVar.f3564b);
                for (int i10 = 0; i10 < bVar.f3566d * 2; i10 += 2) {
                    if (i8 >= this.f3562d.size()) {
                        cVar = new c();
                        this.f3562d.add(cVar);
                    } else {
                        cVar = (c) this.f3562d.get(i8);
                    }
                    int[] iArr = bVar.f3565c;
                    int i11 = iArr[i10 + 1];
                    cVar.f3567a = i11 <= abs;
                    cVar.f3568b = abs;
                    cVar.f3569c = i11;
                    cVar.f3570d = recyclerView2;
                    cVar.f3571e = iArr[i10];
                    i8++;
                }
            }
        }
        Collections.sort(this.f3562d, f3558f);
    }

    private void c(c cVar, long j6) {
        RecyclerView.c0 i6 = i(cVar.f3570d, cVar.f3571e, cVar.f3567a ? Long.MAX_VALUE : j6);
        if (i6 == null || i6.f3309b == null || !i6.s() || i6.t()) {
            return;
        }
        h((RecyclerView) i6.f3309b.get(), j6);
    }

    private void d(long j6) {
        for (int i6 = 0; i6 < this.f3562d.size(); i6++) {
            c cVar = (c) this.f3562d.get(i6);
            if (cVar.f3570d == null) {
                return;
            }
            c(cVar, j6);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i6) {
        int j6 = recyclerView.f3258e.j();
        for (int i7 = 0; i7 < j6; i7++) {
            RecyclerView.c0 f02 = RecyclerView.f0(recyclerView.f3258e.i(i7));
            if (f02.f3310c == i6 && !f02.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j6) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.C && recyclerView.f3258e.j() != 0) {
            recyclerView.T0();
        }
        b bVar = recyclerView.f3261f0;
        bVar.c(recyclerView, true);
        if (bVar.f3566d != 0) {
            try {
                t.a("RV Nested Prefetch");
                recyclerView.f3263g0.f(recyclerView.f3272l);
                for (int i6 = 0; i6 < bVar.f3566d * 2; i6 += 2) {
                    i(recyclerView, bVar.f3565c[i6], j6);
                }
            } finally {
                t.b();
            }
        }
    }

    private RecyclerView.c0 i(RecyclerView recyclerView, int i6, long j6) {
        if (e(recyclerView, i6)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f3252b;
        try {
            recyclerView.F0();
            RecyclerView.c0 I = uVar.I(i6, false, j6);
            if (I != null) {
                if (!I.s() || I.t()) {
                    uVar.a(I, false);
                } else {
                    uVar.B(I.f3308a);
                }
            }
            return I;
        } finally {
            recyclerView.H0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f3559a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i6, int i7) {
        if (recyclerView.isAttachedToWindow() && this.f3560b == 0) {
            this.f3560b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3261f0.e(i6, i7);
    }

    void g(long j6) {
        b();
        d(j6);
    }

    public void j(RecyclerView recyclerView) {
        this.f3559a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            t.a("RV Prefetch");
            if (!this.f3559a.isEmpty()) {
                int size = this.f3559a.size();
                long j6 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3559a.get(i6);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j6 = Math.max(recyclerView.getDrawingTime(), j6);
                    }
                }
                if (j6 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j6) + this.f3561c);
                }
            }
        } finally {
            this.f3560b = 0L;
            t.b();
        }
    }
}
