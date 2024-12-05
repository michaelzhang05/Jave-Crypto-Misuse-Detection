package com.uptodown.activities.preferences;

import C4.g;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Suggestions;
import com.uptodown.activities.preferences.FeedbackPreferences;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3323k;

/* loaded from: classes4.dex */
public final class FeedbackPreferences extends g {

    /* loaded from: classes4.dex */
    public static final class a extends PreferenceFragmentCompat {
        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(a this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            try {
                Intent intent = new Intent(this$0.getActivity(), (Class<?>) Suggestions.class);
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    bundle = UptodownApp.f28003B.a(activity);
                } else {
                    bundle = null;
                }
                this$0.startActivity(intent, bundle);
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(a this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            String string = this$0.getString(R.string.dmca_title);
            AbstractC3159y.h(string, "getString(R.string.dmca_title)");
            String string2 = this$0.getString(R.string.url_dmca);
            AbstractC3159y.h(string2, "getString(R.string.url_dmca)");
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            c3323k.q(requireActivity, string2, string);
            return true;
        }

        @Override // androidx.preference.PreferenceFragmentCompat
        public void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.feedback_preferences);
            Preference findPreference = findPreference("suggestion");
            AbstractC3159y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.h
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean j8;
                    j8 = FeedbackPreferences.a.j(FeedbackPreferences.a.this, preference);
                    return j8;
                }
            });
            Preference findPreference2 = findPreference("dmca");
            AbstractC3159y.f(findPreference2);
            findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.i
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean k8;
                    k8 = FeedbackPreferences.a.k(FeedbackPreferences.a.this, preference);
                    return k8;
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
