package O2;

import O5.InterfaceC1355k;
import O5.l;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7901b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f7902c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f7903a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7904a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f7904a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f7904a.getSharedPreferences("PaymentSheet_LinkStore", 0);
        }
    }

    public d(Context context) {
        AbstractC3255y.i(context, "context");
        this.f7903a = l.b(new b(context));
    }

    private final SharedPreferences a() {
        Object value = this.f7903a.getValue();
        AbstractC3255y.h(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final boolean b() {
        return a().getBoolean("has_used_link", false);
    }

    public final void c() {
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("has_used_link", true);
        edit.apply();
    }
}
