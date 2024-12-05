package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* loaded from: classes.dex */
public class CustomTabActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    public static final String f8972f = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";

    /* renamed from: g, reason: collision with root package name */
    public static final String f8973g = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* renamed from: h, reason: collision with root package name */
    private BroadcastReceiver f8974h;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0) {
            Intent intent2 = new Intent(f8972f);
            intent2.putExtra(CustomTabMainActivity.f8978i, getIntent().getDataString());
            c.m.a.a.b(this).d(intent2);
            this.f8974h = new a();
            c.m.a.a.b(this).c(this.f8974h, new IntentFilter(f8973g));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f8972f);
        intent.putExtra(CustomTabMainActivity.f8978i, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        c.m.a.a.b(this).e(this.f8974h);
        super.onDestroy();
    }
}
