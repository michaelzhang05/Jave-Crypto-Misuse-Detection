package com.airbnb.lottie.q.a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.s.j.h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class k implements l, i {

    /* renamed from: d, reason: collision with root package name */
    private final String f8018d;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s.j.h f8020f;
    private final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f8016b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f8017c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<l> f8019e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.a.values().length];
            a = iArr;
            try {
                iArr[h.a.Merge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.a.Add.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.a.Subtract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h.a.Intersect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h.a.ExcludeIntersections.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k(com.airbnb.lottie.s.j.h hVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f8018d = hVar.c();
            this.f8020f = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i2 = 0; i2 < this.f8019e.size(); i2++) {
            this.f8017c.addPath(this.f8019e.get(i2).c());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.f8016b.reset();
        this.a.reset();
        for (int size = this.f8019e.size() - 1; size >= 1; size--) {
            l lVar = this.f8019e.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                List<l> j2 = cVar.j();
                for (int size2 = j2.size() - 1; size2 >= 0; size2--) {
                    Path c2 = j2.get(size2).c();
                    c2.transform(cVar.k());
                    this.f8016b.addPath(c2);
                }
            } else {
                this.f8016b.addPath(lVar.c());
            }
        }
        l lVar2 = this.f8019e.get(0);
        if (lVar2 instanceof c) {
            c cVar2 = (c) lVar2;
            List<l> j3 = cVar2.j();
            for (int i2 = 0; i2 < j3.size(); i2++) {
                Path c3 = j3.get(i2).c();
                c3.transform(cVar2.k());
                this.a.addPath(c3);
            }
        } else {
            this.a.set(lVar2.c());
        }
        this.f8017c.op(this.a, this.f8016b, op);
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < this.f8019e.size(); i2++) {
            this.f8019e.get(i2).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.q.a.l
    public Path c() {
        this.f8017c.reset();
        int i2 = a.a[this.f8020f.b().ordinal()];
        if (i2 == 1) {
            a();
        } else if (i2 == 2) {
            d(Path.Op.UNION);
        } else if (i2 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            d(Path.Op.XOR);
        }
        return this.f8017c;
    }

    @Override // com.airbnb.lottie.q.a.i
    public void f(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.f8019e.add((l) previous);
                listIterator.remove();
            }
        }
    }
}
