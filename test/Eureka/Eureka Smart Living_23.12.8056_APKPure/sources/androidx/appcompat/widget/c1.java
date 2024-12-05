package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private TextView f945a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f946b;

    /* loaded from: classes.dex */
    private static final class a {
        static TextClassifier a(TextView textView) {
            Object systemService;
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            systemService = textView.getContext().getSystemService((Class<Object>) TextClassificationManager.class);
            TextClassificationManager a6 = z0.a(systemService);
            if (a6 != null) {
                textClassifier2 = a6.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(TextView textView) {
        this.f945a = (TextView) androidx.core.util.h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f946b;
        return textClassifier == null ? a.a(this.f945a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f946b = textClassifier;
    }
}
