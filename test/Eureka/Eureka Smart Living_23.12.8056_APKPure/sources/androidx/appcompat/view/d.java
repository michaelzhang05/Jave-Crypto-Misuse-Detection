package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f441f;

    /* renamed from: a, reason: collision with root package name */
    private int f442a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f443b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f444c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f445d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f446e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i6) {
        super(context);
        this.f442a = i6;
    }

    private Resources b() {
        if (this.f446e == null) {
            Configuration configuration = this.f445d;
            this.f446e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f445d).getResources();
        }
        return this.f446e;
    }

    private void d() {
        boolean z5 = this.f443b == null;
        if (z5) {
            this.f443b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f443b.setTo(theme);
            }
        }
        f(this.f443b, this.f442a, z5);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f441f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f441f = configuration2;
        }
        return configuration.equals(f441f);
    }

    public void a(Configuration configuration) {
        if (this.f446e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f445d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f445d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f442a;
    }

    protected void f(Resources.Theme theme, int i6, boolean z5) {
        theme.applyStyle(i6, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f444c == null) {
            this.f444c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f444c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f443b;
        if (theme != null) {
            return theme;
        }
        if (this.f442a == 0) {
            this.f442a = d.i.f6249d;
        }
        d();
        return this.f443b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        if (this.f442a != i6) {
            this.f442a = i6;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f443b = theme;
    }
}
