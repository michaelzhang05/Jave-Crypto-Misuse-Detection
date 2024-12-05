package L2;

import L5.InterfaceC1227k;
import L5.l;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6110b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f6111c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f6112a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f6113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f6113a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f6113a.getSharedPreferences("PaymentSheet_LinkStore", 0);
        }
    }

    public d(Context context) {
        AbstractC3159y.i(context, "context");
        this.f6112a = l.b(new b(context));
    }

    private final SharedPreferences a() {
        Object value = this.f6112a.getValue();
        AbstractC3159y.h(value, "getValue(...)");
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
