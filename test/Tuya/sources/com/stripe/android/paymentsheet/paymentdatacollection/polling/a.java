package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import L5.I;
import P5.d;
import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.view.InterfaceC2464p;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import l3.AbstractC3176f;
import q3.w;
import v4.C3829a;
import x2.j;

/* loaded from: classes4.dex */
public final class a extends AbstractC3176f {

    /* renamed from: a, reason: collision with root package name */
    private ActivityResultLauncher f26295a;

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0644a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26296a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24540q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24509B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26296a = iArr;
        }
    }

    @Override // l3.AbstractC3176f, j3.InterfaceC3074a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(activityResultCallback, "activityResultCallback");
        this.f26295a = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // l3.AbstractC3176f, j3.InterfaceC3074a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f26295a;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f26295a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l3.AbstractC3176f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2464p interfaceC2464p, StripeIntent stripeIntent, j.c cVar, d dVar) {
        o.p pVar;
        int i8;
        PollingContract.a aVar;
        o.p pVar2;
        o v8 = stripeIntent.v();
        String str = null;
        if (v8 != null) {
            pVar = v8.f24412e;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = C0644a.f26296a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                o v9 = stripeIntent.v();
                if (v9 != null && (pVar2 = v9.f24412e) != null) {
                    str = pVar2.f24550a;
                }
                throw new IllegalStateException(("Received invalid payment method type " + str + " in PollingAuthenticator").toString());
            }
            String d8 = stripeIntent.d();
            if (d8 != null) {
                aVar = new PollingContract.a(d8, interfaceC2464p.b(), 60, 5, 12, w.f37457d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            String d9 = stripeIntent.d();
            if (d9 != null) {
                aVar = new PollingContract.a(d9, interfaceC2464p.b(), 300, 5, 12, w.f37472k0);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Context applicationContext = interfaceC2464p.c().getApplicationContext();
        C3829a c3829a = C3829a.f38797a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, c3829a.a(), c3829a.b());
        AbstractC3159y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        ActivityResultLauncher activityResultLauncher = this.f26295a;
        if (activityResultLauncher == null) {
            i.b.a(i.a.b(i.f33394a, interfaceC2464p.c(), null, 2, null), i.f.f33429e, null, null, 6, null);
        } else {
            activityResultLauncher.launch(aVar, makeCustomAnimation);
        }
        return I.f6487a;
    }
}
