package a0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f17a;

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f18a;

        /* renamed from: b, reason: collision with root package name */
        private final d f19b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20c = true;

        a(TextView textView) {
            this.f18a = textView;
            this.f19b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f19b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f19b;
            return inputFilterArr2;
        }

        private SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                InputFilter inputFilter = inputFilterArr[i6];
                if (inputFilter instanceof d) {
                    sparseArray.put(i6, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e6 = e(inputFilterArr);
            if (e6.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - e6.size()];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (e6.indexOfKey(i7) < 0) {
                    inputFilterArr2[i6] = inputFilterArr[i7];
                    i6++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f18a.setFilters(a(this.f18a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // a0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f20c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // a0.f.b
        void b(boolean z5) {
            if (z5) {
                j();
            }
        }

        @Override // a0.f.b
        void c(boolean z5) {
            this.f20c = z5;
            j();
            i();
        }

        void g(boolean z5) {
            this.f20c = z5;
        }

        void j() {
            this.f18a.setTransformationMethod(l(this.f18a.getTransformationMethod()));
        }

        TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f20c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        abstract void b(boolean z5);

        abstract void c(boolean z5);
    }

    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f21a;

        c(TextView textView) {
            this.f21a = new a(textView);
        }

        private boolean d() {
            return !androidx.emoji2.text.e.h();
        }

        @Override // a0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f21a.a(inputFilterArr);
        }

        @Override // a0.f.b
        void b(boolean z5) {
            if (d()) {
                return;
            }
            this.f21a.b(z5);
        }

        @Override // a0.f.b
        void c(boolean z5) {
            if (d()) {
                this.f21a.g(z5);
            } else {
                this.f21a.c(z5);
            }
        }
    }

    public f(TextView textView, boolean z5) {
        androidx.core.util.h.g(textView, "textView cannot be null");
        this.f17a = !z5 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f17a.a(inputFilterArr);
    }

    public void b(boolean z5) {
        this.f17a.b(z5);
    }

    public void c(boolean z5) {
        this.f17a.c(z5);
    }
}
