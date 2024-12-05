package e.g.a.d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import rx.e;
import rx.j;

/* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
/* loaded from: classes2.dex */
final class c implements e.a<e.g.a.d.b> {

    /* renamed from: f, reason: collision with root package name */
    final TextView f17706f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class a implements TextWatcher {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f17707f;

        a(j jVar) {
            this.f17707f = jVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f17707f.isUnsubscribed()) {
                return;
            }
            this.f17707f.onNext(e.g.a.d.b.b(c.this.f17706f, editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* loaded from: classes2.dex */
    public class b extends rx.l.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextWatcher f17709f;

        b(TextWatcher textWatcher) {
            this.f17709f = textWatcher;
        }

        @Override // rx.l.a
        protected void onUnsubscribe() {
            c.this.f17706f.removeTextChangedListener(this.f17709f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(TextView textView) {
        this.f17706f = textView;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(j<? super e.g.a.d.b> jVar) {
        rx.l.a.verifyMainThread();
        a aVar = new a(jVar);
        jVar.add(new b(aVar));
        this.f17706f.addTextChangedListener(aVar);
        TextView textView = this.f17706f;
        jVar.onNext(e.g.a.d.b.b(textView, textView.getEditableText()));
    }
}
