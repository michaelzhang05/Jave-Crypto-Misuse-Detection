package s2;

import L5.s;
import L5.t;
import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3744b {

    /* renamed from: b, reason: collision with root package name */
    private static final a f37846b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f37847a;

    /* renamed from: s2.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0872b extends CustomTabsServiceConnection {
        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            AbstractC3159y.i(componentName, "componentName");
            AbstractC3159y.i(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC3159y.i(name, "name");
        }
    }

    public C3744b(Context context) {
        AbstractC3159y.i(context, "context");
        this.f37847a = context;
    }

    private final boolean b() {
        Object b8;
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(Boolean.valueOf(CustomTabsClient.bindCustomTabsService(this.f37847a, "com.android.chrome", new C0872b())));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (s.g(b8)) {
            b8 = bool;
        }
        return ((Boolean) b8).booleanValue();
    }

    public final EnumC3743a a() {
        if (b()) {
            return EnumC3743a.f37842a;
        }
        return EnumC3743a.f37843b;
    }
}
