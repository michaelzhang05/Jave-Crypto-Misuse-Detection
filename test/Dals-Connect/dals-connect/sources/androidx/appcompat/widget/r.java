package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class r {
    private TextView a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f573b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(TextView textView) {
        this.a = (TextView) c.h.j.j.c(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f573b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f573b = textClassifier;
    }
}
