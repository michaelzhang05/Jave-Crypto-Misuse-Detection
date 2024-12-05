package com.getcapacitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class CapacitorWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private BaseInputConnection f4261a;

    /* renamed from: b, reason: collision with root package name */
    private h f4262b;

    public CapacitorWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 2) {
            return super.dispatchKeyEvent(keyEvent);
        }
        evaluateJavascript("document.activeElement.value = document.activeElement.value + '" + keyEvent.getCharacters() + "';", null);
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        h hVar = this.f4262b;
        if (!(hVar != null ? hVar.n() : c0.w(getContext())).q()) {
            return super.onCreateInputConnection(editorInfo);
        }
        if (this.f4261a == null) {
            this.f4261a = new BaseInputConnection(this, false);
        }
        return this.f4261a;
    }

    public void setBridge(h hVar) {
        this.f4262b = hVar;
    }
}
