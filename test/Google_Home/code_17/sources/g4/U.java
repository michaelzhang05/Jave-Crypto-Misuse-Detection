package G4;

import G4.U;
import H4.j;
import X4.S0;
import Z4.InterfaceC1587a;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import g2.EnumC2864d;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import i2.C2977a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import q5.C3859h;
import r5.AbstractC3938h;
import s5.C4003g;

/* loaded from: classes4.dex */
public final class U extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Z4.s f3158a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f3159b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3160c;

    /* renamed from: d, reason: collision with root package name */
    private String f3161d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3162e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3163f;

    /* renamed from: g, reason: collision with root package name */
    private YouTubePlayerView f3164g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2865e f3165h;

    /* renamed from: i, reason: collision with root package name */
    private String f3166i;

    /* renamed from: j, reason: collision with root package name */
    private int f3167j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3168k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3169l;

    /* renamed from: m, reason: collision with root package name */
    private C3859h f3170m;

    /* renamed from: n, reason: collision with root package name */
    private int f3171n;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private Z4.s f3172b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1587a f3173c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3174d;

        /* renamed from: e, reason: collision with root package name */
        private String f3175e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f3176f;

        /* renamed from: g, reason: collision with root package name */
        private final RelativeLayout f3177g;

        /* renamed from: h, reason: collision with root package name */
        private final ProgressBar f3178h;

        /* renamed from: i, reason: collision with root package name */
        private final ImageView f3179i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f3180j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f3181k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f3182l;

        /* renamed from: m, reason: collision with root package name */
        private final TextView f3183m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f3184n;

        /* renamed from: o, reason: collision with root package name */
        private final LinearLayout f3185o;

        /* renamed from: p, reason: collision with root package name */
        private final CardView f3186p;

        /* renamed from: q, reason: collision with root package name */
        private final View f3187q;

        /* renamed from: r, reason: collision with root package name */
        private final int f3188r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ U f3189s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U u8, View itemView, Z4.s listener, InterfaceC1587a actionsClickListener, Context context, String fragmentName) {
            super(itemView, context);
            AbstractC3255y.i(itemView, "itemView");
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(actionsClickListener, "actionsClickListener");
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(fragmentName, "fragmentName");
            this.f3189s = u8;
            this.f3172b = listener;
            this.f3173c = actionsClickListener;
            this.f3174d = context;
            this.f3175e = fragmentName;
            View findViewById = itemView.findViewById(R.id.iv_image_video_featured_item);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.…mage_video_featured_item)");
            this.f3176f = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.rl_video_card_info);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.rl_video_card_info)");
            this.f3177g = (RelativeLayout) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.pb_progress_video_featured_item);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f3178h = (ProgressBar) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.iv_logo_video_featured_item);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…logo_video_featured_item)");
            this.f3179i = (ImageView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.tv_name_video_featured_item);
            AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…name_video_featured_item)");
            TextView textView = (TextView) findViewById5;
            this.f3180j = textView;
            View findViewById6 = itemView.findViewById(R.id.tv_desc_video_featured_item);
            AbstractC3255y.h(findViewById6, "itemView.findViewById(R.…desc_video_featured_item)");
            TextView textView2 = (TextView) findViewById6;
            this.f3181k = textView2;
            View findViewById7 = itemView.findViewById(R.id.tv_status_video_featured_item);
            AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…atus_video_featured_item)");
            this.f3182l = (TextView) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_progress_video_featured_item);
            AbstractC3255y.h(findViewById8, "itemView.findViewById(R.…ress_video_featured_item)");
            TextView textView3 = (TextView) findViewById8;
            this.f3183m = textView3;
            View findViewById9 = itemView.findViewById(R.id.tv_verified_video_featured_item);
            AbstractC3255y.h(findViewById9, "itemView.findViewById(R.…fied_video_featured_item)");
            TextView textView4 = (TextView) findViewById9;
            this.f3184n = textView4;
            View findViewById10 = itemView.findViewById(R.id.ll_progress_video_featured_item);
            AbstractC3255y.h(findViewById10, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f3185o = (LinearLayout) findViewById10;
            View findViewById11 = itemView.findViewById(R.id.cv_youtube_player_view);
            AbstractC3255y.h(findViewById11, "itemView.findViewById(R.id.cv_youtube_player_view)");
            this.f3186p = (CardView) findViewById11;
            View findViewById12 = itemView.findViewById(R.id.v_player_controller);
            AbstractC3255y.h(findViewById12, "itemView.findViewById(R.id.v_player_controller)");
            this.f3187q = findViewById12;
            this.f3188r = UptodownApp.f29058B.H();
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a this$0, C1641h app, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3173c.a(app, i8);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(U this$0, View view) {
            AbstractC3255y.i(this$0, "this$0");
            if (this$0.q()) {
                InterfaceC2865e interfaceC2865e = this$0.f3165h;
                if (interfaceC2865e != null) {
                    interfaceC2865e.pause();
                    return;
                }
                return;
            }
            InterfaceC2865e interfaceC2865e2 = this$0.f3165h;
            if (interfaceC2865e2 != null) {
                interfaceC2865e2.play();
            }
        }

        private final void r(C1641h c1641h) {
            i(c1641h, this.f3180j, this.f3181k);
            c(this.f3177g, this.f3172b, c1641h);
            C4003g c4003g = new C4003g((int) this.f3174d.getResources().getDimension(R.dimen.border_radius_m), null, 2, null);
            String e02 = c1641h.e0();
            if (e02 != null && e02.length() != 0) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                if (aVar.A() > 0) {
                    this.f3176f.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.A()));
                    com.squareup.picasso.s.h().l(c1641h.c0()).m(aVar.B(), aVar.A()).n(c4003g).i(this.f3176f);
                } else {
                    this.f3176f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    com.squareup.picasso.s.h().l(c1641h.c0()).f().n(c4003g).i(this.f3176f);
                }
            } else {
                this.f3176f.setImageDrawable(ContextCompat.getDrawable(this.f3174d, R.drawable.shape_bg_placeholder));
            }
            h(this.f3179i, c1641h.m0());
        }

        public final void n(final C1641h app, final int i8) {
            AbstractC3255y.i(app, "app");
            this.f3186p.setVisibility(8);
            this.f3187q.setVisibility(8);
            this.f3176f.setVisibility(0);
            r(app);
            e(app, this.f3178h, this.f3179i, this.f3181k, this.f3183m, this.f3182l, this.f3185o);
            this.f3177g.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.T
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean o8;
                    o8 = U.a.o(U.a.this, app, i8, view);
                    return o8;
                }
            });
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f3188r, -1), this.f3174d, i8, this.f3189s.f3171n));
            c(this.f3176f, this.f3172b, app);
        }

        public final void p(C1641h app, int i8) {
            ArrayList i12;
            AbstractC3255y.i(app, "app");
            if (this.f3189s.f3164g != null) {
                YouTubePlayerView youTubePlayerView = this.f3189s.f3164g;
                AbstractC3255y.f(youTubePlayerView);
                if (youTubePlayerView.getParent() != null) {
                    YouTubePlayerView youTubePlayerView2 = this.f3189s.f3164g;
                    AbstractC3255y.f(youTubePlayerView2);
                    ViewParent parent = youTubePlayerView2.getParent();
                    AbstractC3255y.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f3189s.f3164g);
                }
                this.f3186p.addView(this.f3189s.f3164g);
                this.f3186p.setVisibility(0);
                this.f3187q.setVisibility(0);
                this.f3176f.setVisibility(8);
                r(app);
                View view = this.f3187q;
                final U u8 = this.f3189s;
                view.setOnClickListener(new View.OnClickListener() { // from class: G4.S
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        U.a.q(U.this, view2);
                    }
                });
                this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f3188r, -1), this.f3174d, i8, this.f3189s.f3171n));
                if (this.f3189s.p() && this.f3189s.f3165h != null && (i12 = app.i1()) != null && !i12.isEmpty()) {
                    ArrayList i13 = app.i1();
                    AbstractC3255y.f(i13);
                    if (((a5.T) i13.get(0)).getId() != null) {
                        U u9 = this.f3189s;
                        StringBuilder sb = new StringBuilder();
                        String s02 = app.s0();
                        AbstractC3255y.f(s02);
                        sb.append(s02);
                        sb.append(this.f3175e);
                        u9.f3166i = sb.toString();
                        if (AbstractC3255y.d(this.f3175e, kotlin.jvm.internal.U.b(S0.class).b())) {
                            UptodownApp.f29058B.o0(this.f3189s.f3165h);
                        } else {
                            UptodownApp.f29058B.p0(this.f3189s.f3165h);
                        }
                        UptodownApp.a aVar = UptodownApp.f29058B;
                        if (aVar.f(this.f3174d) && SettingsPreferences.f30353b.l(this.f3174d) > 0) {
                            if (aVar.J().containsKey(this.f3189s.f3166i)) {
                                InterfaceC2865e interfaceC2865e = this.f3189s.f3165h;
                                AbstractC3255y.f(interfaceC2865e);
                                ArrayList i14 = app.i1();
                                AbstractC3255y.f(i14);
                                String id = ((a5.T) i14.get(0)).getId();
                                AbstractC3255y.f(id);
                                Object obj = aVar.J().get(this.f3189s.f3166i);
                                AbstractC3255y.f(obj);
                                interfaceC2865e.e(id, ((Number) obj).floatValue());
                            } else {
                                InterfaceC2865e interfaceC2865e2 = this.f3189s.f3165h;
                                AbstractC3255y.f(interfaceC2865e2);
                                ArrayList i15 = app.i1();
                                AbstractC3255y.f(i15);
                                String id2 = ((a5.T) i15.get(0)).getId();
                                AbstractC3255y.f(id2);
                                interfaceC2865e2.e(id2, 0.0f);
                                aVar.J().put(this.f3189s.f3166i, Float.valueOf(0.0f));
                            }
                            if (this.f3189s.n()) {
                                InterfaceC2865e interfaceC2865e3 = this.f3189s.f3165h;
                                AbstractC3255y.f(interfaceC2865e3);
                                interfaceC2865e3.play();
                                return;
                            } else {
                                InterfaceC2865e interfaceC2865e4 = this.f3189s.f3165h;
                                AbstractC3255y.f(interfaceC2865e4);
                                interfaceC2865e4.pause();
                                return;
                            }
                        }
                        if (aVar.J().containsKey(this.f3189s.f3166i)) {
                            InterfaceC2865e interfaceC2865e5 = this.f3189s.f3165h;
                            AbstractC3255y.f(interfaceC2865e5);
                            ArrayList i16 = app.i1();
                            AbstractC3255y.f(i16);
                            String id3 = ((a5.T) i16.get(0)).getId();
                            AbstractC3255y.f(id3);
                            Object obj2 = aVar.J().get(this.f3189s.f3166i);
                            AbstractC3255y.f(obj2);
                            interfaceC2865e5.c(id3, ((Number) obj2).floatValue());
                        } else {
                            InterfaceC2865e interfaceC2865e6 = this.f3189s.f3165h;
                            AbstractC3255y.f(interfaceC2865e6);
                            ArrayList i17 = app.i1();
                            AbstractC3255y.f(i17);
                            String id4 = ((a5.T) i17.get(0)).getId();
                            AbstractC3255y.f(id4);
                            interfaceC2865e6.c(id4, 0.0f);
                            aVar.J().put(this.f3189s.f3166i, Float.valueOf(0.0f));
                        }
                        String e02 = app.e0();
                        if (e02 != null && e02.length() != 0) {
                            C3859h c3859h = this.f3189s.f3170m;
                            AbstractC3255y.f(c3859h);
                            c3859h.l().setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
                ArrayList i18 = app.i1();
                if (i18 == null || i18.isEmpty()) {
                    n(app, i8);
                }
                if (this.f3189s.f3165h == null) {
                    this.f3189s.o();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2897a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3191b;

        b(View view) {
            this.f3191b = view;
        }

        @Override // h2.AbstractC2897a, h2.c
        public void c(InterfaceC2865e youTubePlayer) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            super.c(youTubePlayer);
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.A() == 0) {
                YouTubePlayerView youTubePlayerView = U.this.f3164g;
                AbstractC3255y.f(youTubePlayerView);
                if (youTubePlayerView.getHeight() != 0) {
                    YouTubePlayerView youTubePlayerView2 = U.this.f3164g;
                    AbstractC3255y.f(youTubePlayerView2);
                    aVar.F0(youTubePlayerView2.getHeight());
                    YouTubePlayerView youTubePlayerView3 = U.this.f3164g;
                    AbstractC3255y.f(youTubePlayerView3);
                    aVar.G0(youTubePlayerView3.getWidth());
                }
            }
            U u8 = U.this;
            u8.f3170m = new C3859h(this.f3191b, youTubePlayer, u8.f3160c);
            C3859h c3859h = U.this.f3170m;
            AbstractC3255y.f(c3859h);
            youTubePlayer.d(c3859h);
            youTubePlayer.f();
            U.this.f3165h = youTubePlayer;
            U.this.v(true);
            U.this.notifyItemChanged(0);
        }

        @Override // h2.AbstractC2897a, h2.c
        public void e(InterfaceC2865e youTubePlayer, float f8) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            super.e(youTubePlayer, f8);
            UptodownApp.f29058B.J().put(U.this.f3166i, Float.valueOf(f8));
        }

        @Override // h2.AbstractC2897a, h2.c
        public void f(InterfaceC2865e youTubePlayer, EnumC2864d state) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            AbstractC3255y.i(state, "state");
            super.f(youTubePlayer, state);
            EnumC2864d enumC2864d = EnumC2864d.BUFFERING;
            if (state == enumC2864d && U.this.n()) {
                youTubePlayer.play();
            }
            if (state == enumC2864d && AbstractC3255y.d(U.this.f3161d, kotlin.jvm.internal.U.b(S0.class).b())) {
                youTubePlayer.play();
            }
            if (state == EnumC2864d.PAUSED) {
                U.this.x(false);
            }
            if (state == EnumC2864d.PLAYING) {
                U.this.x(true);
            }
        }
    }

    public U(Z4.s listener, InterfaceC1587a actionsClickListener, Context context, String fragmentName) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(fragmentName, "fragmentName");
        this.f3158a = listener;
        this.f3159b = actionsClickListener;
        this.f3160c = context;
        this.f3161d = fragmentName;
        this.f3162e = new ArrayList();
        this.f3166i = "";
        this.f3169l = true;
        this.f3171n = 8;
        if (!SettingsPreferences.f30353b.L(this.f3160c)) {
            try {
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this.f3160c);
                youTubePlayerView.setEnableAutomaticInitialization(false);
                this.f3164g = youTubePlayerView;
                o();
            } catch (Exception e8) {
                SettingsPreferences.f30353b.F0(this.f3160c, true);
                this.f3164g = null;
                e8.printStackTrace();
            } catch (UnsatisfiedLinkError e9) {
                SettingsPreferences.f30353b.F0(this.f3160c, true);
                this.f3164g = null;
                e9.printStackTrace();
            }
        }
        if (AbstractC3255y.d(this.f3161d, kotlin.jvm.internal.U.b(S0.class).b())) {
            this.f3171n = 8;
        } else {
            this.f3171n = 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        YouTubePlayerView youTubePlayerView = this.f3164g;
        if (youTubePlayerView != null) {
            AbstractC3255y.f(youTubePlayerView);
            View d8 = youTubePlayerView.d(R.layout.home_youtube_player_layout);
            C2977a c8 = new C2977a.C0764a().e(0).h(0).g(3).d(1).c();
            YouTubePlayerView youTubePlayerView2 = this.f3164g;
            AbstractC3255y.f(youTubePlayerView2);
            youTubePlayerView2.e(new b(d8), c8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3162e.size();
    }

    public final ArrayList l() {
        return this.f3162e;
    }

    public final int m() {
        return this.f3167j;
    }

    public final boolean n() {
        return this.f3163f;
    }

    public final boolean p() {
        return this.f3168k;
    }

    public final boolean q() {
        return this.f3169l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        int i9 = i8 + 1;
        if (!SettingsPreferences.f30353b.L(this.f3160c) && i8 == this.f3167j) {
            Object obj = this.f3162e.get(i8);
            AbstractC3255y.h(obj, "apps[position]");
            holder.p((C1641h) obj, i9);
        } else {
            Object obj2 = this.f3162e.get(i8);
            AbstractC3255y.h(obj2, "apps[position]");
            holder.n((C1641h) obj2, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_video_featured_item, parent, false);
        AbstractC3255y.h(itemView, "itemView");
        return new a(this, itemView, this.f3158a, this.f3159b, this.f3160c, this.f3161d);
    }

    public final void t(int i8) {
        this.f3167j = i8;
    }

    public final void u(ArrayList appList) {
        AbstractC3255y.i(appList, "appList");
        ArrayList arrayList = this.f3162e;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    public final void v(boolean z8) {
        this.f3168k = z8;
    }

    public final void w(boolean z8) {
        this.f3163f = z8;
    }

    public final void x(boolean z8) {
        this.f3169l = z8;
    }
}
