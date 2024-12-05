package com.uptodown.activities;

import a5.C1631C;
import a5.C1639f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import o5.AbstractC3685y;
import o5.C3667g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class w extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30458a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30459b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30460a;

        public a(ArrayList positives) {
            AbstractC3255y.i(positives, "positives");
            this.f30460a = positives;
        }

        public final ArrayList a() {
            return this.f30460a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f30460a, ((a) obj).f30460a);
        }

        public int hashCode() {
            return this.f30460a.hashCode();
        }

        public String toString() {
            return "SecurityData(positives=" + this.f30460a + ')';
        }
    }

    public w() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30458a = a8;
        this.f30459b = a8;
    }

    public final void a(Context context) {
        AbstractC3255y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        ArrayList A8 = new C3667g().A(context);
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (aVar.w() != null) {
            ArrayList w8 = aVar.w();
            AbstractC3255y.f(w8);
            Iterator it = w8.iterator();
            while (it.hasNext()) {
                C1631C c1631c = (C1631C) it.next();
                Iterator it2 = A8.iterator();
                while (it2.hasNext()) {
                    C1639f c1639f = (C1639f) it2.next();
                    if (AbstractC3255y.d(c1631c.c(), c1639f.X())) {
                        c1639f.E0(c1631c);
                        arrayList.add(c1639f);
                    }
                }
            }
        }
        C3667g.f36491a.c(arrayList, context);
        this.f30458a.setValue(new AbstractC3685y.c(new a(arrayList)));
    }

    public final InterfaceC3698L b() {
        return this.f30459b;
    }
}
