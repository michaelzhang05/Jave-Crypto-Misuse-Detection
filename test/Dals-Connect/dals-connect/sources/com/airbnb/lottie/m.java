package com.airbnb.lottie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes.dex */
public class m {
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f7959b = new c.e.b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.v.d> f7960c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<c.h.j.f<String, Float>> f7961d = new a();

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    class a implements Comparator<c.h.j.f<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.h.j.f<String, Float> fVar, c.h.j.f<String, Float> fVar2) {
            float floatValue = fVar.f2746b.floatValue();
            float floatValue2 = fVar2.f2746b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(float f2);
    }

    public void a(String str, float f2) {
        if (this.a) {
            com.airbnb.lottie.v.d dVar = this.f7960c.get(str);
            if (dVar == null) {
                dVar = new com.airbnb.lottie.v.d();
                this.f7960c.put(str, dVar);
            }
            dVar.a(f2);
            if (str.equals("__container")) {
                Iterator<b> it = this.f7959b.iterator();
                while (it.hasNext()) {
                    it.next().a(f2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.a = z;
    }
}
