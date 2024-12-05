package G5;

import G5.f;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.J0;

/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3398c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f3399a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f3400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, f fVar, S5.d dVar) {
            super(2, dVar);
            this.f3399a = bitmap;
            this.f3400b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f3399a, this.f3400b, dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new a(this.f3399a, this.f3400b, (S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            t.b(obj);
            Bitmap bitmap = this.f3399a;
            if (bitmap != null) {
                f fVar = this.f3400b;
                ImageView imageView = fVar.f3386b;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                ImageView imageView2 = fVar.f3386b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
            f fVar2 = this.f3400b;
            f.a aVar = f.f3383l;
            fVar2.getClass();
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(fVar2.f3385a);
            ImageView imageView3 = fVar2.f3386b;
            if (imageView3 != null && imageView3.getVisibility() == 0) {
                ImageView imageView4 = fVar2.f3386b;
                if (imageView4 != null) {
                    Button button = fVar2.f3387c;
                    if (button != null) {
                        constraintSet.connect(button.getId(), 4, imageView4.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f3385a);
                }
            } else {
                TextView textView = fVar2.f3391g;
                if (textView != null) {
                    Button button2 = fVar2.f3387c;
                    if (button2 != null) {
                        constraintSet.connect(button2.getId(), 4, textView.getId(), 4);
                    }
                    constraintSet.applyTo(fVar2.f3385a);
                }
            }
            return I.f8278a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Bitmap bitmap, f fVar, S5.d dVar) {
        super(2, dVar);
        this.f3397b = bitmap;
        this.f3398c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new g(this.f3397b, this.f3398c, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new g(this.f3397b, this.f3398c, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f3396a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            J0 G8 = C3347b0.c().G();
            a aVar = new a(this.f3397b, this.f3398c, null);
            this.f3396a = 1;
            if (AbstractC3360i.g(G8, aVar, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
