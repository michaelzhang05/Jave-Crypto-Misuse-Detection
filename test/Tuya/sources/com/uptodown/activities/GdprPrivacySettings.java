package com.uptodown.activities;

import E4.j;
import L5.InterfaceC1227k;
import T4.I0;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3311E;
import l5.C3323k;
import l5.C3330r;

/* loaded from: classes4.dex */
public final class GdprPrivacySettings extends AbstractActivityC2489a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28257N = L5.l.b(new a());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0 invoke() {
            return I0.c(GdprPrivacySettings.this.getLayoutInflater());
        }
    }

    private final I0 h3() {
        return (I0) this.f28257N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.h3().f10163k;
        AbstractC3159y.h(switchCompat, "binding.sAnalyticsWizardPrivacy");
        TextView textView = this$0.h3().f10170r;
        AbstractC3159y.h(textView, "binding.tvDescriptionAnalyticsWizardPrivacy");
        this$0.u3(switchCompat, textView, z8);
        this$0.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.h3().f10165m;
        AbstractC3159y.h(switchCompat, "binding.sErrorLogWizardPrivacy");
        TextView textView = this$0.h3().f10172t;
        AbstractC3159y.h(textView, "binding.tvDescriptionErrorLogWizardPrivacy");
        this$0.u3(switchCompat, textView, z8);
        this$0.s3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(GdprPrivacySettings this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SwitchCompat switchCompat = this$0.h3().f10164l;
        AbstractC3159y.h(switchCompat, "binding.sDeviceAnalysisWizardPrivacy");
        TextView textView = this$0.h3().f10171s;
        AbstractC3159y.h(textView, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
        this$0.u3(switchCompat, textView, z8);
        this$0.s3();
        if (!this$0.h3().f10164l.isChecked()) {
            this$0.h3().f10152C.setVisibility(0);
        } else {
            this$0.h3().f10152C.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String string = this$0.getString(R.string.url_contact);
            AbstractC3159y.h(string, "getString(R.string.url_contact)");
            C3323k.r(c3323k, this$0, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        new C3311E().a(this$0, true);
        new C3311E().b(false);
        this$0.h3().f10164l.setChecked(true);
        this$0.h3().f10163k.setChecked(true);
        this$0.h3().f10165m.setChecked(true);
        this$0.r3();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s3();
        this$0.h3().f10164l.setChecked(false);
        this$0.h3().f10163k.setChecked(false);
        this$0.h3().f10165m.setChecked(false);
    }

    private final void q3() {
        ChoiceCmp.forceDisplayUI(this);
        ChoiceCmp.showUSRegulationScreen(this);
    }

    private final void r3() {
        boolean isChecked = h3().f10165m.isChecked();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (aVar.Q(this) != isChecked) {
            aVar.A0(this, isChecked);
            new C3330r(this).f();
        }
        boolean isChecked2 = h3().f10163k.isChecked();
        if (aVar.M(this) != isChecked2) {
            aVar.u0(this, isChecked2);
        }
        boolean isChecked3 = h3().f10164l.isChecked();
        if (aVar.k0(this) != isChecked3) {
            aVar.e1(this, isChecked3);
        }
        if (aVar.k0(this)) {
            UptodownApp.a aVar2 = UptodownApp.f28003B;
            UptodownApp.a.N0(aVar2, this, false, 2, null);
            aVar2.K(this);
            setResult(-1);
            return;
        }
        setResult(0);
    }

    private final void s3() {
        if (h3().f10168p.getVisibility() == 0) {
            h3().f10166n.setText(R.string.save_gdpr);
            h3().f10166n.setOnClickListener(new View.OnClickListener() { // from class: A4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdprPrivacySettings.t3(GdprPrivacySettings.this, view);
                }
            });
            h3().f10168p.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(GdprPrivacySettings this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.r3();
        this$0.finish();
    }

    private final void u3(SwitchCompat switchCompat, TextView textView, boolean z8) {
        if (z8) {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
            textView.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        } else {
            switchCompat.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
            textView.setTextColor(ContextCompat.getColor(this, R.color.main_light_grey));
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h3().getRoot());
        h3().f10154b.setOnClickListener(new View.OnClickListener() { // from class: A4.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.i3(GdprPrivacySettings.this, view);
            }
        });
        TextView textView = h3().f10174v;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        h3().f10151B.setTypeface(aVar.t());
        h3().f10167o.setTypeface(aVar.u());
        h3().f10177y.setTypeface(aVar.t());
        h3().f10171s.setTypeface(aVar.u());
        h3().f10176x.setTypeface(aVar.t());
        h3().f10170r.setTypeface(aVar.u());
        h3().f10178z.setTypeface(aVar.t());
        h3().f10172t.setTypeface(aVar.u());
        h3().f10175w.setTypeface(aVar.t());
        h3().f10169q.setTypeface(aVar.u());
        h3().f10150A.setTypeface(aVar.t());
        h3().f10173u.setTypeface(aVar.u());
        h3().f10166n.setTypeface(aVar.t());
        h3().f10168p.setTypeface(aVar.t());
        h3().f10152C.setText("⚠ " + getString(R.string.tracking_disabled_warning_gdpr) + " ⚠");
        h3().f10152C.setTypeface(aVar.u());
        SwitchCompat switchCompat = h3().f10163k;
        SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
        switchCompat.setChecked(aVar2.M(this));
        h3().f10165m.setChecked(aVar2.Q(this));
        h3().f10164l.setChecked(aVar2.k0(this));
        if (aVar2.V(this)) {
            SwitchCompat switchCompat2 = h3().f10163k;
            AbstractC3159y.h(switchCompat2, "binding.sAnalyticsWizardPrivacy");
            TextView textView2 = h3().f10170r;
            AbstractC3159y.h(textView2, "binding.tvDescriptionAnalyticsWizardPrivacy");
            u3(switchCompat2, textView2, h3().f10163k.isChecked());
            SwitchCompat switchCompat3 = h3().f10165m;
            AbstractC3159y.h(switchCompat3, "binding.sErrorLogWizardPrivacy");
            TextView textView3 = h3().f10172t;
            AbstractC3159y.h(textView3, "binding.tvDescriptionErrorLogWizardPrivacy");
            u3(switchCompat3, textView3, h3().f10165m.isChecked());
            SwitchCompat switchCompat4 = h3().f10164l;
            AbstractC3159y.h(switchCompat4, "binding.sDeviceAnalysisWizardPrivacy");
            TextView textView4 = h3().f10171s;
            AbstractC3159y.h(textView4, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
            u3(switchCompat4, textView4, h3().f10164l.isChecked());
        } else {
            SwitchCompat switchCompat5 = h3().f10163k;
            AbstractC3159y.h(switchCompat5, "binding.sAnalyticsWizardPrivacy");
            TextView textView5 = h3().f10170r;
            AbstractC3159y.h(textView5, "binding.tvDescriptionAnalyticsWizardPrivacy");
            u3(switchCompat5, textView5, true);
            SwitchCompat switchCompat6 = h3().f10165m;
            AbstractC3159y.h(switchCompat6, "binding.sErrorLogWizardPrivacy");
            TextView textView6 = h3().f10172t;
            AbstractC3159y.h(textView6, "binding.tvDescriptionErrorLogWizardPrivacy");
            u3(switchCompat6, textView6, true);
            SwitchCompat switchCompat7 = h3().f10164l;
            AbstractC3159y.h(switchCompat7, "binding.sDeviceAnalysisWizardPrivacy");
            TextView textView7 = h3().f10171s;
            AbstractC3159y.h(textView7, "binding.tvDescriptionDeviceAnalysisWizardPrivacy");
            u3(switchCompat7, textView7, true);
            h3().f10163k.setChecked(true);
            h3().f10165m.setChecked(true);
            h3().f10164l.setChecked(true);
        }
        if (!h3().f10164l.isChecked()) {
            h3().f10152C.setVisibility(0);
        } else {
            h3().f10152C.setVisibility(8);
        }
        h3().f10163k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.H
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.j3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        h3().f10165m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.I
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.k3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        h3().f10156d.setOnClickListener(new View.OnClickListener() { // from class: A4.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.l3(GdprPrivacySettings.this, view);
            }
        });
        h3().f10164l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: A4.K
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                GdprPrivacySettings.m3(GdprPrivacySettings.this, compoundButton, z8);
            }
        });
        h3().f10161i.setOnClickListener(new View.OnClickListener() { // from class: A4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.n3(GdprPrivacySettings.this, view);
            }
        });
        h3().f10166n.setOnClickListener(new View.OnClickListener() { // from class: A4.M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.o3(GdprPrivacySettings.this, view);
            }
        });
        h3().f10168p.setOnClickListener(new View.OnClickListener() { // from class: A4.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GdprPrivacySettings.p3(GdprPrivacySettings.this, view);
            }
        });
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (!aVar.V(this)) {
            aVar.G0(this, true);
            aVar.u0(this, true);
            aVar.A0(this, true);
            aVar.e1(this, true);
        }
    }
}
