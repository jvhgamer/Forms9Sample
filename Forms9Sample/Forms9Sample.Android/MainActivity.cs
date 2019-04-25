using Android.App;
using Android.Content.PM;
using Android.OS;
using Android.Content.Res;
using Android.Content;

namespace Forms9Sample.Droid
{
    [Activity(Label = "Forms9Sample", Icon = "@mipmap/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            base.OnCreate(savedInstanceState);
            global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
            LoadApplication(new App());
        }

        protected override void AttachBaseContext(Context @base)
        {
            Configuration overrideConfiguration = new Configuration();
            overrideConfiguration = base.Resources.Configuration;
            overrideConfiguration.SetToDefaults();
            Context context = CreateConfigurationContext(overrideConfiguration);
            base.AttachBaseContext(context);
        }

        public override Resources Resources
        {
            get
            {
                Resources res = base.Resources;
                return res;
            }
        }

        //public override Resources Resources
        //{
        //    get
        //    {
        //        Resources res = base.Resources;
        //        Configuration config = new Configuration();
        //        config.SetToDefaults();

        //        res.UpdateConfiguration(config, res.DisplayMetrics);
        //        return res;
        //    }
        //}
    }
}