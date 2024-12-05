package r5;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.UptodownApp;
import com.uptodown.views.FullHeightImageView;
import kotlin.jvm.internal.AbstractC3255y;
import l2.InterfaceC3309b;

/* renamed from: r5.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3949m0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private Z4.C f39045a;

    /* renamed from: b, reason: collision with root package name */
    private int f39046b;

    /* renamed from: r5.m0$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3309b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.L f39048b;

        a(a5.L l8) {
            this.f39048b = l8;
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
            e8.printStackTrace();
            C3949m0.this.f39045a.a(this.f39048b);
        }

        @Override // l2.InterfaceC3309b
        public void b() {
            if (C3949m0.this.f39046b == 0) {
                View view = C3949m0.this.itemView;
                AbstractC3255y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                if (((FullHeightImageView) view).getWidth() > 0) {
                    C3949m0 c3949m0 = C3949m0.this;
                    View view2 = c3949m0.itemView;
                    AbstractC3255y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                    c3949m0.f39046b = ((FullHeightImageView) view2).getWidth();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3949m0(View itemView, Z4.C listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        this.f39045a = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C3949m0 this$0, a5.L screenShot, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(screenShot, "$screenShot");
        this$0.f39045a.c(screenShot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3949m0 this$0, a5.T video, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(video, "$video");
        this$0.f39045a.b(video);
    }

    public final void f(final a5.L screenShot) {
        AbstractC3255y.i(screenShot, "screenShot");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3949m0.h(C3949m0.this, screenShot, view);
            }
        });
        View view = this.itemView;
        AbstractC3255y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        ((FullHeightImageView) view).setMinimumWidth(this.f39046b);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(screenShot.h());
        UptodownApp.a aVar = UptodownApp.f29058B;
        Context context = this.itemView.getContext();
        AbstractC3255y.h(context, "itemView.context");
        com.squareup.picasso.w n8 = l8.n(aVar.g0(context));
        View view2 = this.itemView;
        AbstractC3255y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view2, new a(screenShot));
    }

    public final void g(final a5.T video) {
        AbstractC3255y.i(video, "video");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3949m0.i(C3949m0.this, video, view);
            }
        });
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(video.a());
        UptodownApp.a aVar = UptodownApp.f29058B;
        Context context = this.itemView.getContext();
        AbstractC3255y.h(context, "itemView.context");
        com.squareup.picasso.w n8 = l8.n(aVar.e0(context));
        View view = this.itemView;
        AbstractC3255y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view, new b(video));
    }

    /* renamed from: r5.m0$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC3309b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.T f39050b;

        b(a5.T t8) {
            this.f39050b = t8;
        }

        @Override // l2.InterfaceC3309b
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
            e8.printStackTrace();
            C3949m0.this.f39045a.d(this.f39050b);
        }

        @Override // l2.InterfaceC3309b
        public void b() {
        }
    }
}
