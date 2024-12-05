package com.stripe.android.view;

import L5.InterfaceC1227k;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.InterfaceC2460n;
import j2.AbstractC3049A;
import j2.AbstractC3052D;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class M0 extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    private boolean f27421d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27418a = L5.l.b(new d());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f27419b = L5.l.b(new b());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f27420c = L5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1227k f27422e = L5.l.b(new a());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1227k f27423f = L5.l.b(new c());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2460n.a invoke() {
            return new InterfaceC2460n.a(M0.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearProgressIndicator invoke() {
            return M0.this.r().f3099b;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N0 invoke() {
            return new N0(M0.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.b invoke() {
            G2.b c8 = G2.b.c(M0.this.getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewStub invoke() {
            ViewStub viewStub = M0.this.r().f3101d;
            AbstractC3159y.h(viewStub, "viewStub");
            return viewStub;
        }
    }

    private final InterfaceC2460n o() {
        return (InterfaceC2460n) this.f27422e.getValue();
    }

    private final N0 q() {
        return (N0) this.f27423f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G2.b r() {
        return (G2.b) this.f27418a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(r().getRoot());
        setSupportActionBar(r().f3100c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3159y.i(menu, "menu");
        getMenuInflater().inflate(AbstractC3052D.f32826a, menu);
        menu.findItem(AbstractC3049A.f32765b).setEnabled(!this.f27421d);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == AbstractC3049A.f32765b) {
            t();
            return true;
        }
        boolean onOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!onOptionsItemSelected) {
            getOnBackPressedDispatcher().onBackPressed();
            return onOptionsItemSelected;
        }
        return onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        AbstractC3159y.i(menu, "menu");
        MenuItem findItem = menu.findItem(AbstractC3049A.f32765b);
        N0 q8 = q();
        Resources.Theme theme = getTheme();
        AbstractC3159y.h(theme, "getTheme(...)");
        findItem.setIcon(q8.f(theme, R.attr.titleTextColor, j2.z.f33125M));
        return super.onPrepareOptionsMenu(menu);
    }

    public final ProgressBar p() {
        Object value = this.f27419b.getValue();
        AbstractC3159y.h(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final ViewStub s() {
        return (ViewStub) this.f27420c.getValue();
    }

    protected abstract void t();

    protected void u(boolean z8) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(boolean z8) {
        int i8;
        ProgressBar p8 = p();
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        p8.setVisibility(i8);
        invalidateOptionsMenu();
        u(z8);
        this.f27421d = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(String error) {
        AbstractC3159y.i(error, "error");
        o().show(error);
    }
}
