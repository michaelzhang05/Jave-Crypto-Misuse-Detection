package com.uptodown.tv.preferences;

import C4.g;
import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3323k;

/* loaded from: classes5.dex */
public final class TvPrivacyPreferences extends g {

    /* loaded from: classes5.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            String string = this$0.getString(R.string.url_contact);
            AbstractC3159y.h(string, "getString(R.string.url_contact)");
            C3323k.r(c3323k, requireActivity, string, null, 4, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            aVar.G0(requireContext, true);
            Context requireContext2 = this$0.requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            aVar.u0(requireContext2, true);
            Context requireContext3 = this$0.requireContext();
            AbstractC3159y.h(requireContext3, "requireContext()");
            aVar.A0(requireContext3, true);
            Context requireContext4 = this$0.requireContext();
            AbstractC3159y.h(requireContext4, "requireContext()");
            aVar.e1(requireContext4, true);
            this$0.requireActivity().finish();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean m(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            aVar.G0(requireContext, false);
            Context requireContext2 = this$0.requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            aVar.u0(requireContext2, false);
            Context requireContext3 = this$0.requireContext();
            AbstractC3159y.h(requireContext3, "requireContext()");
            aVar.A0(requireContext3, false);
            Context requireContext4 = this$0.requireContext();
            AbstractC3159y.h(requireContext4, "requireContext()");
            aVar.e1(requireContext4, false);
            this$0.requireActivity().finish();
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.tv_privacy_preferences);
            Preference findPreference = findPreference("right_to_be_forgotten");
            AbstractC3159y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: f5.a
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = TvPrivacyPreferences.a.k(TvPrivacyPreferences.a.this, preference);
                    return k8;
                }
            });
            Preference findPreference2 = findPreference("privacy_accept_all");
            AbstractC3159y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: f5.b
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean l8;
                    l8 = TvPrivacyPreferences.a.l(TvPrivacyPreferences.a.this, preference);
                    return l8;
                }
            });
            Preference findPreference3 = findPreference("privacy_decline_all");
            AbstractC3159y.f(findPreference3);
            findPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: f5.c
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean m8;
                    m8 = TvPrivacyPreferences.a.m(TvPrivacyPreferences.a.this, preference);
                    return m8;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}
