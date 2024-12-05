package a0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private final TransformationMethod f29a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TransformationMethod transformationMethod) {
        this.f29a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f29a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f29a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.e.b().d() != 1) ? charSequence : androidx.emoji2.text.e.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.f29a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i6, rect);
        }
    }
}
