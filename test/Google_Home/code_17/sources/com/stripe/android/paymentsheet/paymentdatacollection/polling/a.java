package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import A2.j;
import O5.I;
import S5.d;
import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import o3.AbstractC3524f;
import t3.w;
import y4.C4206a;

/* loaded from: classes4.dex */
public final class a extends AbstractC3524f {

    /* renamed from: a, reason: collision with root package name */
    private ActivityResultLauncher f27350a;

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0640a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27351a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25595q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25564B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27351a = iArr;
        }
    }

    @Override // o3.AbstractC3524f, m3.InterfaceC3428a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(activityResultCallback, "activityResultCallback");
        this.f27350a = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // o3.AbstractC3524f, m3.InterfaceC3428a
    public void c() {
        ActivityResultLauncher activityResultLauncher = this.f27350a;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f27350a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o3.AbstractC3524f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2658p interfaceC2658p, StripeIntent stripeIntent, j.c cVar, d dVar) {
        o.p pVar;
        int i8;
        PollingContract.a aVar;
        o.p pVar2;
        o r8 = stripeIntent.r();
        String str = null;
        if (r8 != null) {
            pVar = r8.f25467e;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = C0640a.f27351a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                o r9 = stripeIntent.r();
                if (r9 != null && (pVar2 = r9.f25467e) != null) {
                    str = pVar2.f25605a;
                }
                throw new IllegalStateException(("Received invalid payment method type " + str + " in PollingAuthenticator").toString());
            }
            String d8 = stripeIntent.d();
            if (d8 != null) {
                aVar = new PollingContract.a(d8, interfaceC2658p.a(), 60, 5, 12, w.f39779d);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            String d9 = stripeIntent.d();
            if (d9 != null) {
                aVar = new PollingContract.a(d9, interfaceC2658p.a(), 300, 5, 12, w.f39794k0);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Context applicationContext = interfaceC2658p.c().getApplicationContext();
        C4206a c4206a = C4206a.f40928a;
        ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(applicationContext, c4206a.a(), c4206a.b());
        AbstractC3255y.h(makeCustomAnimation, "makeCustomAnimation(...)");
        ActivityResultLauncher activityResultLauncher = this.f27350a;
        if (activityResultLauncher == null) {
            i.b.a(i.a.b(i.f35386a, interfaceC2658p.c(), null, 2, null), i.f.f35421e, null, null, 6, null);
        } else {
            activityResultLauncher.launch(aVar, makeCustomAnimation);
        }
        return I.f8278a;
    }
}
