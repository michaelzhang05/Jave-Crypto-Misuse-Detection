package com.stripe.android.link;

import N2.b;
import O2.d;
import P2.c;
import Q2.a;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.link.LinkActivityContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final LinkActivityContract f25033a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25034b;

    /* renamed from: c, reason: collision with root package name */
    private final c f25035c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f25036d;

    public a(a.InterfaceC0180a linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, d linkStore) {
        AbstractC3255y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        AbstractC3255y.i(linkActivityContract, "linkActivityContract");
        AbstractC3255y.i(linkStore, "linkStore");
        this.f25033a = linkActivityContract;
        this.f25034b = linkStore;
        this.f25035c = linkAnalyticsComponentBuilder.build().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, Function1 callback, b bVar) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(callback, "$callback");
        c cVar = this$0.f25035c;
        AbstractC3255y.f(bVar);
        cVar.c(bVar);
        if (bVar instanceof b.C0137b) {
            this$0.f25034b.c();
        }
        callback.invoke(bVar);
    }

    public final void b(N2.d configuration) {
        AbstractC3255y.i(configuration, "configuration");
        LinkActivityContract.a aVar = new LinkActivityContract.a(configuration);
        ActivityResultLauncher activityResultLauncher = this.f25036d;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(aVar);
        }
        this.f25035c.a();
    }

    public final void c(ActivityResultCaller activityResultCaller, final Function1 callback) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(callback, "callback");
        this.f25036d = activityResultCaller.registerForActivityResult(this.f25033a, new ActivityResultCallback() { // from class: N2.g
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.link.a.d(com.stripe.android.link.a.this, callback, (b) obj);
            }
        });
    }

    public final void e() {
        ActivityResultLauncher activityResultLauncher = this.f25036d;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f25036d = null;
    }
}
