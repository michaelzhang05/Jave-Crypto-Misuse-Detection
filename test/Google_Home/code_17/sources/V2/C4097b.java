package v2;

import O5.s;
import O5.t;
import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4097b {

    /* renamed from: b, reason: collision with root package name */
    private static final a f40119b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f40120a;

    /* renamed from: v2.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0908b extends CustomTabsServiceConnection {
        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            AbstractC3255y.i(componentName, "componentName");
            AbstractC3255y.i(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC3255y.i(name, "name");
        }
    }

    public C4097b(Context context) {
        AbstractC3255y.i(context, "context");
        this.f40120a = context;
    }

    private final boolean b() {
        Object b8;
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(Boolean.valueOf(CustomTabsClient.bindCustomTabsService(this.f40120a, "com.android.chrome", new C0908b())));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (s.g(b8)) {
            b8 = bool;
        }
        return ((Boolean) b8).booleanValue();
    }

    public final EnumC4096a a() {
        if (b()) {
            return EnumC4096a.f40115a;
        }
        return EnumC4096a.f40116b;
    }
}
