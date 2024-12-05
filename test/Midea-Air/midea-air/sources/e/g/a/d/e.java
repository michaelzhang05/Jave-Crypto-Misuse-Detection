package e.g.a.d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import rx.e;
import rx.j;

/* compiled from: TextViewTextChangeEventOnSubscribe.java */
/* loaded from: classes2.dex */
final class e implements e.a<d> {

    /* renamed from: f, reason: collision with root package name */
    final TextView f17715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class a implements TextWatcher {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f17716f;

        a(j jVar) {
            this.f17716f = jVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (this.f17716f.isUnsubscribed()) {
                return;
            }
            this.f17716f.onNext(d.b(e.this.f17715f, charSequence, i2, i3, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextWatcher f17718f;

        b(TextWatcher textWatcher) {
            this.f17718f = textWatcher;
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            e.this.f17715f.removeTextChangedListener(this.f17718f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(TextView textView) {
        this.f17715f = textView;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super d> jVar) {
        rx.l.a.verifyMainThread();
        a aVar = new a(jVar);
        jVar.add(new b(aVar));
        this.f17715f.addTextChangedListener(aVar);
        TextView textView = this.f17715f;
        jVar.onNext(d.b(textView, textView.getText(), 0, 0, 0));
    }
}
