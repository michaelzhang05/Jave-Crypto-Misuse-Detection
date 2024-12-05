package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final Class f2575a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2576b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a, reason: collision with root package name */
        final Object f2577a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f2578b = new AtomicInteger(0);

        a(Object obj) {
            this.f2577a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        final void a() {
            this.f2578b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2577a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.f2577a).beforeTextChanged(charSequence, i6, i7, i8);
        }

        final void c() {
            this.f2578b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f2578b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2577a).onSpanAdded(spannable, obj, i6, i7);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i6, int i7, int i8, int i9) {
            int i10;
            int i11;
            if (this.f2578b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i6 > i7) {
                        i6 = 0;
                    }
                    if (i8 > i9) {
                        i10 = i6;
                        i11 = 0;
                        ((SpanWatcher) this.f2577a).onSpanChanged(spannable, obj, i10, i7, i11, i9);
                    }
                }
                i10 = i6;
                i11 = i8;
                ((SpanWatcher) this.f2577a).onSpanChanged(spannable, obj, i10, i7, i11, i9);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f2578b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2577a).onSpanRemoved(spannable, obj, i6, i7);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.f2577a).onTextChanged(charSequence, i6, i7, i8);
        }
    }

    n(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2576b = new ArrayList();
        androidx.core.util.h.g(cls, "watcherClass cannot be null");
        this.f2575a = cls;
    }

    private void b() {
        for (int i6 = 0; i6 < this.f2576b.size(); i6++) {
            ((a) this.f2576b.get(i6)).a();
        }
    }

    public static n c(Class cls, CharSequence charSequence) {
        return new n(cls, charSequence);
    }

    private void e() {
        for (int i6 = 0; i6 < this.f2576b.size(); i6++) {
            ((a) this.f2576b.get(i6)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i6 = 0; i6 < this.f2576b.size(); i6++) {
            a aVar = (a) this.f2576b.get(i6);
            if (aVar.f2577a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f2575a == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i6 = 0; i6 < this.f2576b.size(); i6++) {
            ((a) this.f2576b.get(i6)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f6;
        if (h(obj) && (f6 = f(obj)) != null) {
            obj = f6;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f6;
        if (h(obj) && (f6 = f(obj)) != null) {
            obj = f6;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f6;
        if (h(obj) && (f6 = f(obj)) != null) {
            obj = f6;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i6, int i7, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i6, i7, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i6, i7, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i8 = 0; i8 < aVarArr.length; i8++) {
            objArr[i8] = aVarArr[i8].f2577a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i6, int i7, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2576b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i6, int i7, int i8) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f2576b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i6, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i6, int i7) {
        return new n(this.f2575a, this, i6, i7);
    }

    n(Class cls, CharSequence charSequence, int i6, int i7) {
        super(charSequence, i6, i7);
        this.f2576b = new ArrayList();
        androidx.core.util.h.g(cls, "watcherClass cannot be null");
        this.f2575a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence) {
        b();
        super.replace(i6, i7, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        b();
        super.replace(i6, i7, charSequence, i8, i9);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }
}
