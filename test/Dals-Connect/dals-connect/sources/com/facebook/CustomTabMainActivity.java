package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.x;

/* loaded from: classes.dex */
public class CustomTabMainActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    public static final String f8975f = CustomTabMainActivity.class.getSimpleName() + ".extra_action";

    /* renamed from: g, reason: collision with root package name */
    public static final String f8976g = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* renamed from: h, reason: collision with root package name */
    public static final String f8977h = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* renamed from: i, reason: collision with root package name */
    public static final String f8978i = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* renamed from: j, reason: collision with root package name */
    public static final String f8979j = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* renamed from: k, reason: collision with root package name */
    private boolean f8980k = true;
    private BroadcastReceiver l;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f8979j);
            String str = CustomTabMainActivity.f8978i;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private static Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle a0 = x.a0(parse.getQuery());
        a0.putAll(x.a0(parse.getFragment()));
        return a0;
    }

    private void b(int i2, Intent intent) {
        c.m.a.a.b(this).e(this.l);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f8978i);
            Intent m = com.facebook.internal.s.m(getIntent(), stringExtra != null ? a(stringExtra) : new Bundle(), null);
            if (m != null) {
                intent = m;
            }
            setResult(i2, intent);
        } else {
            setResult(i2, com.facebook.internal.s.m(getIntent(), null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.f8972f;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(f8975f);
            Bundle bundleExtra = getIntent().getBundleExtra(f8976g);
            new com.facebook.internal.e(stringExtra, bundleExtra).b(this, getIntent().getStringExtra(f8977h));
            this.f8980k = false;
            this.l = new a();
            c.m.a.a.b(this).c(this.l, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f8979j.equals(intent.getAction())) {
            c.m.a.a.b(this).d(new Intent(CustomTabActivity.f8973g));
            b(-1, intent);
        } else if (CustomTabActivity.f8972f.equals(intent.getAction())) {
            b(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f8980k) {
            b(0, null);
        }
        this.f8980k = true;
    }
}
