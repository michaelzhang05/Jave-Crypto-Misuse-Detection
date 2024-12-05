package com.stripe.android.link;

import K2.b;
import L2.d;
import M2.c;
import N2.a;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.link.LinkActivityContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final LinkActivityContract f23978a;

    /* renamed from: b, reason: collision with root package name */
    private final d f23979b;

    /* renamed from: c, reason: collision with root package name */
    private final c f23980c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f23981d;

    public a(a.InterfaceC0151a linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, d linkStore) {
        AbstractC3159y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        AbstractC3159y.i(linkActivityContract, "linkActivityContract");
        AbstractC3159y.i(linkStore, "linkStore");
        this.f23978a = linkActivityContract;
        this.f23979b = linkStore;
        this.f23980c = linkAnalyticsComponentBuilder.build().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, Function1 callback, b bVar) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(callback, "$callback");
        c cVar = this$0.f23980c;
        AbstractC3159y.f(bVar);
        cVar.c(bVar);
        if (bVar instanceof b.C0112b) {
            this$0.f23979b.c();
        }
        callback.invoke(bVar);
    }

    public final void b(K2.d configuration) {
        AbstractC3159y.i(configuration, "configuration");
        LinkActivityContract.a aVar = new LinkActivityContract.a(configuration);
        ActivityResultLauncher activityResultLauncher = this.f23981d;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(aVar);
        }
        this.f23980c.a();
    }

    public final void c(ActivityResultCaller activityResultCaller, final Function1 callback) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(callback, "callback");
        this.f23981d = activityResultCaller.registerForActivityResult(this.f23978a, new ActivityResultCallback() { // from class: K2.g
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.link.a.d(com.stripe.android.link.a.this, callback, (b) obj);
            }
        });
    }

    public final void e() {
        ActivityResultLauncher activityResultLauncher = this.f23981d;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f23981d = null;
    }
}
