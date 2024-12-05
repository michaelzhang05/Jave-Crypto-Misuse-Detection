package com.stripe.android.stripe3ds2.views;

import P5.N;
import T3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.DrawableRes;
import androidx.core.widget.CompoundButtonCompat;
import g6.i;
import g6.m;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class ChallengeZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ThreeDS2HeaderTextView f28034a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f28035b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2Button f28036c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreeDS2Button f28037d;

    /* renamed from: e, reason: collision with root package name */
    private final ThreeDS2TextView f28038e;

    /* renamed from: f, reason: collision with root package name */
    private final RadioGroup f28039f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f28040g;

    /* renamed from: h, reason: collision with root package name */
    private final RadioButton f28041h;

    /* renamed from: i, reason: collision with root package name */
    private final RadioButton f28042i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public final void a(String str, W3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f28034a.a(str, dVar);
        } else {
            this.f28034a.setVisibility(8);
        }
    }

    public final void b(String str, W3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f28035b.a(str, dVar);
        } else {
            this.f28035b.setVisibility(8);
        }
    }

    public final void c(String str, W3.b bVar) {
        if (str != null && !n.u(str)) {
            this.f28037d.setVisibility(0);
            this.f28037d.setText(str);
            this.f28037d.setButtonCustomization(bVar);
        }
    }

    public final void d(String str, W3.b bVar) {
        if (str != null && !n.u(str)) {
            this.f28036c.setText(str);
            this.f28036c.setButtonCustomization(bVar);
        } else {
            this.f28036c.setVisibility(8);
        }
    }

    public final void e(String str, W3.d dVar, W3.b bVar) {
        RadioButton radioButton;
        if (str != null && !n.u(str)) {
            this.f28038e.a(str, dVar);
            if (bVar != null) {
                i s8 = m.s(0, this.f28039f.getChildCount());
                ArrayList<RadioButton> arrayList = new ArrayList();
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    View childAt = this.f28039f.getChildAt(((N) it).nextInt());
                    if (childAt instanceof RadioButton) {
                        radioButton = (RadioButton) childAt;
                    } else {
                        radioButton = null;
                    }
                    if (radioButton != null) {
                        arrayList.add(radioButton);
                    }
                }
                for (RadioButton radioButton2 : arrayList) {
                    String g8 = bVar.g();
                    if (g8 != null && !n.u(g8)) {
                        CompoundButtonCompat.setButtonTintList(radioButton2, ColorStateList.valueOf(Color.parseColor(bVar.g())));
                    }
                    String p8 = bVar.p();
                    if (p8 != null && !n.u(p8)) {
                        radioButton2.setTextColor(Color.parseColor(bVar.p()));
                    }
                }
            }
            this.f28038e.setVisibility(0);
            this.f28039f.setVisibility(0);
        }
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.f28040g;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.f28034a;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.f28035b;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.f28037d;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.f28036c;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.f28042i;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.f28039f;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.f28041h;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.f28038e;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        if (this.f28039f.getCheckedRadioButtonId() == S3.d.f9782l) {
            return true;
        }
        return false;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        AbstractC3255y.i(challengeEntryView, "challengeEntryView");
        this.f28040g.addView(challengeEntryView);
    }

    public final void setInfoTextIndicator(@DrawableRes int i8) {
        this.f28035b.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.f28037d.setOnClickListener(onClickListener);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.f28036c.setOnClickListener(onClickListener);
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        h b8 = h.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        ThreeDS2HeaderTextView czvHeader = b8.f10036c;
        AbstractC3255y.h(czvHeader, "czvHeader");
        this.f28034a = czvHeader;
        ThreeDS2TextView czvInfo = b8.f10037d;
        AbstractC3255y.h(czvInfo, "czvInfo");
        this.f28035b = czvInfo;
        ThreeDS2Button czvSubmitButton = b8.f10039f;
        AbstractC3255y.h(czvSubmitButton, "czvSubmitButton");
        this.f28036c = czvSubmitButton;
        ThreeDS2Button czvResendButton = b8.f10038e;
        AbstractC3255y.h(czvResendButton, "czvResendButton");
        this.f28037d = czvResendButton;
        ThreeDS2TextView czvWhitelistingLabel = b8.f10043j;
        AbstractC3255y.h(czvWhitelistingLabel, "czvWhitelistingLabel");
        this.f28038e = czvWhitelistingLabel;
        RadioGroup czvWhitelistRadioGroup = b8.f10041h;
        AbstractC3255y.h(czvWhitelistRadioGroup, "czvWhitelistRadioGroup");
        this.f28039f = czvWhitelistRadioGroup;
        FrameLayout czvEntryView = b8.f10035b;
        AbstractC3255y.h(czvEntryView, "czvEntryView");
        this.f28040g = czvEntryView;
        RadioButton czvWhitelistYesButton = b8.f10042i;
        AbstractC3255y.h(czvWhitelistYesButton, "czvWhitelistYesButton");
        this.f28041h = czvWhitelistYesButton;
        RadioButton czvWhitelistNoButton = b8.f10040g;
        AbstractC3255y.h(czvWhitelistNoButton, "czvWhitelistNoButton");
        this.f28042i = czvWhitelistNoButton;
    }
}
