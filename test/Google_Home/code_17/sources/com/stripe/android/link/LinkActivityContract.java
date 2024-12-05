package com.stripe.android.link;

import N2.b;
import N2.c;
import N2.d;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import h3.m;
import kotlin.jvm.internal.AbstractC3255y;
import m2.r;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class LinkActivityContract extends ActivityResultContract<a, b> {

    /* renamed from: a, reason: collision with root package name */
    private final m f25028a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f25029a;

        public a(d configuration) {
            AbstractC3255y.i(configuration, "configuration");
            this.f25029a = configuration;
        }

        public final d a() {
            return this.f25029a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f25029a, ((a) obj).f25029a);
        }

        public int hashCode() {
            return this.f25029a.hashCode();
        }

        public String toString() {
            return "Args(configuration=" + this.f25029a + ")";
        }
    }

    public LinkActivityContract(m stripeRepository) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        this.f25028a = stripeRepository;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        r a8 = r.f35037c.a(context);
        return LinkForegroundActivity.f25030b.a(context, T2.a.Companion.a(input.a(), context, a8.g(), a8.h(), m.a.a(this.f25028a, null, 1, null)).b());
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b parseResult(int i8, Intent intent) {
        return c.a(i8, intent);
    }
}
