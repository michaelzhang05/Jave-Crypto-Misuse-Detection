package com.stripe.android.view;

import O5.InterfaceC1355k;
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
import com.stripe.android.view.InterfaceC2654n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3403A;
import m2.AbstractC3406D;

/* loaded from: classes4.dex */
public abstract class M0 extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    private boolean f28476d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f28473a = O5.l.b(new d());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f28474b = O5.l.b(new b());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f28475c = O5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f28477e = O5.l.b(new a());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1355k f28478f = O5.l.b(new c());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2654n.a invoke() {
            return new InterfaceC2654n.a(M0.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearProgressIndicator invoke() {
            return M0.this.r().f4818b;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
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
    static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J2.b invoke() {
            J2.b c8 = J2.b.c(M0.this.getLayoutInflater());
            AbstractC3255y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewStub invoke() {
            ViewStub viewStub = M0.this.r().f4820d;
            AbstractC3255y.h(viewStub, "viewStub");
            return viewStub;
        }
    }

    private final InterfaceC2654n o() {
        return (InterfaceC2654n) this.f28477e.getValue();
    }

    private final N0 q() {
        return (N0) this.f28478f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J2.b r() {
        return (J2.b) this.f28473a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(r().getRoot());
        setSupportActionBar(r().f4819c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3255y.i(menu, "menu");
        getMenuInflater().inflate(AbstractC3406D.f34802a, menu);
        menu.findItem(AbstractC3403A.f34741b).setEnabled(!this.f28476d);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3255y.i(item, "item");
        if (item.getItemId() == AbstractC3403A.f34741b) {
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
        AbstractC3255y.i(menu, "menu");
        MenuItem findItem = menu.findItem(AbstractC3403A.f34741b);
        N0 q8 = q();
        Resources.Theme theme = getTheme();
        AbstractC3255y.h(theme, "getTheme(...)");
        findItem.setIcon(q8.f(theme, R.attr.titleTextColor, m2.z.f35101M));
        return super.onPrepareOptionsMenu(menu);
    }

    public final ProgressBar p() {
        Object value = this.f28474b.getValue();
        AbstractC3255y.h(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final ViewStub s() {
        return (ViewStub) this.f28475c.getValue();
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
        this.f28476d = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(String error) {
        AbstractC3255y.i(error, "error");
        o().show(error);
    }
}
