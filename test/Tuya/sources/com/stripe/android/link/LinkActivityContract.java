package com.stripe.android.link;

import K2.b;
import K2.c;
import K2.d;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import e3.m;
import j2.r;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class LinkActivityContract extends ActivityResultContract<a, b> {

    /* renamed from: a, reason: collision with root package name */
    private final m f23973a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f23974a;

        public a(d configuration) {
            AbstractC3159y.i(configuration, "configuration");
            this.f23974a = configuration;
        }

        public final d a() {
            return this.f23974a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f23974a, ((a) obj).f23974a);
        }

        public int hashCode() {
            return this.f23974a.hashCode();
        }

        public String toString() {
            return "Args(configuration=" + this.f23974a + ")";
        }
    }

    public LinkActivityContract(m stripeRepository) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        this.f23973a = stripeRepository;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        r a8 = r.f33061c.a(context);
        return LinkForegroundActivity.f23975b.a(context, Q2.a.Companion.a(input.a(), context, a8.e(), a8.f(), m.a.a(this.f23973a, null, 1, null)).b());
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b parseResult(int i8, Intent intent) {
        return c.a(i8, intent);
    }
}
