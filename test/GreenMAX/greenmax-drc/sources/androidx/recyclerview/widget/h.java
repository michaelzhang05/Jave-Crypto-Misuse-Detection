package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final ThreadLocal<h> f1569f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    static Comparator<c> f1570g = new a();

    /* renamed from: i, reason: collision with root package name */
    long f1572i;

    /* renamed from: j, reason: collision with root package name */
    long f1573j;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<RecyclerView> f1571h = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<c> f1574k = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    static class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f1580d;
            if ((recyclerView == null) != (cVar2.f1580d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = cVar2.f1578b - cVar.f1578b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f1579c - cVar2.f1579c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1575b;

        /* renamed from: c, reason: collision with root package name */
        int[] f1576c;

        /* renamed from: d, reason: collision with root package name */
        int f1577d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 >= 0) {
                int i4 = this.f1577d * 2;
                int[] iArr = this.f1576c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1576c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i4 * 2];
                    this.f1576c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1576c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f1577d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f1576c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1577d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.f1577d = 0;
            int[] iArr = this.f1576c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.p()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.a, this.f1575b, recyclerView.mState, this);
            }
            int i2 = this.f1577d;
            if (i2 > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i2;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i2) {
            if (this.f1576c != null) {
                int i3 = this.f1577d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f1576c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i2, int i3) {
            this.a = i2;
            this.f1575b = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public int f1578b;

        /* renamed from: c, reason: collision with root package name */
        public int f1579c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f1580d;

        /* renamed from: e, reason: collision with root package name */
        public int f1581e;

        c() {
        }

        public void a() {
            this.a = false;
            this.f1578b = 0;
            this.f1579c = 0;
            this.f1580d = null;
            this.f1581e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f1571h.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f1571h.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i2 += recyclerView.mPrefetchRegistry.f1577d;
            }
        }
        this.f1574k.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f1571h.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.f1575b);
                for (int i6 = 0; i6 < bVar.f1577d * 2; i6 += 2) {
                    if (i4 >= this.f1574k.size()) {
                        cVar = new c();
                        this.f1574k.add(cVar);
                    } else {
                        cVar = this.f1574k.get(i4);
                    }
                    int[] iArr = bVar.f1576c;
                    int i7 = iArr[i6 + 1];
                    cVar.a = i7 <= abs;
                    cVar.f1578b = abs;
                    cVar.f1579c = i7;
                    cVar.f1580d = recyclerView2;
                    cVar.f1581e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f1574k, f1570g);
    }

    private void c(c cVar, long j2) {
        RecyclerView.c0 i2 = i(cVar.f1580d, cVar.f1581e, cVar.a ? Long.MAX_VALUE : j2);
        if (i2 == null || i2.mNestedRecyclerView == null || !i2.isBound() || i2.isInvalid()) {
            return;
        }
        h(i2.mNestedRecyclerView.get(), j2);
    }

    private void d(long j2) {
        for (int i2 = 0; i2 < this.f1574k.size(); i2++) {
            c cVar = this.f1574k.get(i2);
            if (cVar.f1580d == null) {
                return;
            }
            c(cVar, j2);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i2) {
        int j2 = recyclerView.mChildHelper.j();
        for (int i3 = 0; i3 < j2; i3++) {
            RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i3));
            if (childViewHolderInt.mPosition == i2 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f1577d != 0) {
            try {
                androidx.core.os.c.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i2 = 0; i2 < bVar.f1577d * 2; i2 += 2) {
                    i(recyclerView, bVar.f1576c[i2], j2);
                }
            } finally {
                androidx.core.os.c.b();
            }
        }
    }

    private RecyclerView.c0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.c0 I = vVar.I(i2, false, j2);
            if (I != null) {
                if (I.isBound() && !I.isInvalid()) {
                    vVar.B(I.itemView);
                } else {
                    vVar.a(I, false);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1571h.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f1572i == 0) {
            this.f1572i = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i2, i3);
    }

    void g(long j2) {
        b();
        d(j2);
    }

    public void j(RecyclerView recyclerView) {
        this.f1571h.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.c.a("RV Prefetch");
            if (!this.f1571h.isEmpty()) {
                int size = this.f1571h.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f1571h.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1573j);
                }
            }
        } finally {
            this.f1572i = 0L;
            androidx.core.os.c.b();
        }
    }
}
