package com.liguanqiao.springclouddemo.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;


public class UacGenCodeUtil {


    public static void main(String[] args) {
        generateCode();
    }

    /**
     * 执行生成代码
     */
    public static void generateCode() {
        StringBuffer sb = new StringBuffer();
        sb
                .append(System.getProperty("user.dir"))
                .append(File.separator)
                .append("springclouddemo-generator")
                .append(File.separator)
                .append("src")
                .append(File.separator)
                .append("main")
                .append(File.separator)
                .append("java");
        //项目包名
        String packageName = "com.liguanqiao.springclouddemo";
        //位置>>>>>>建议设置非项目路径再拷贝进来项目
        String outPutDir = sb.toString();
        //数组格式为  ===》》》generateByTables(packageName, "t_student", "t_city", "t_idcard");
       /* generateByTables(packageName, "admin_user", "admin_user_image","advertising_management","cashier","cashier_pay_channel","function_list"
        ,"help_information","help_information_image","merchant","merchant_data","merchant_data_image","merchant_data_rate","merchant_user"
                ,"meun_list","notes_to_payee","notice_management","pay_channel","pay_code","pay_provider","pay_type","payment_staging","pc_push_persion"
                ,"print_management","push_type","role","role_with_fl","role_with_ml","scheduling_log","set_shift","shift_management","shift_records","store"
                ,"store_classify","store_pay_channel","wx_sub_account","wx_sub_account_accpet"*/
        /**
         * admin_user/merchant/merchant_user/store/cashier/notice_management/help_information/pay_channel
         * "pay_channel","admin_user","merchant","merchant_user","store","cashier","notice_management","help_information"
         */
        generateByTables(packageName,outPutDir, "admin");

    }

    /**
     * @param packageName 包名
     * @param tableNames  表名，可以多个表
     */
    private static void generateByTables(String packageName, String outPutDir, String... tableNames) {

        // 数据库信息
        String dbUrl = "jdbc:mysql://localhost:3306/springclouddemo-uac?allowMultiQueries=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        DataSourceConfig dataSourceConfig = new DataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("as123456")
                // mysql 5
//                .setDriverName("com.mysql.jdbc.Driver")
                // mysql 8
                .setDriverName("com.mysql.cj.jdbc.Driver")
                /*.setTypeConvert(new MySqlTypeConvert() {
                    @Override
                    public PropertyInfo processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        //.....
                        // 当发现生成的类型并不能满足你的要求时，可以去这里看，然后重写
                    }
                })*/;

        // 配置
        GlobalConfig config = new GlobalConfig()
                .setActiveRecord(false)
                //作者
                .setAuthor("lgq")
                //建议设置非项目路径再拷贝进来项目
                .setOutputDir(outPutDir)
                //.setOutputDir("paycore-base\\src\\main\\java")
                .setFileOverride(true)
                // 不需要ActiveRecord特性的请改为false
                .setActiveRecord(true)
                // XML 二级缓存
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList
                .setBaseColumnList(false)
                //是否生成 kotlin 代码
                .setKotlin(false)
                // 自定义文件命名，注意 %s 会自动填充表实体属性！
                .setMapperName("%sMapper")
                .setXmlName("%sMapper")
                .setServiceName("%sService")
                .setServiceImplName("%sServiceImpl")
                //.setControllerName("%sController")
                //只使用 java.util.date 代替
                .setDateType(DateType.ONLY_DATE)
                .setIdType(IdType.ID_WORKER)
                // model swagger2
                .setSwagger2(true);
        //.setOpen(true) // 是否打开输出目录


        StrategyConfig strategyConfig = new StrategyConfig()
                // 全局大写命名 ORACLE 注意
                .setCapitalMode(true)
                //.setDbColumnUnderline(true)
                // 此处可以修改为您的表前缀(数组)
                //.setTablePrefix("t_")
                // 表名生成策略
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames)
                //.setExclude(new String[]{"pre"}) // 排除生成的表
                // lombok实体
                .setEntityLombokModel(true)
                // 【实体】是否为构建者模型（默认 false）
                .setEntityBuilderModel(false)
                // 【实体】是否生成字段常量（默认 false）// 可通过常量名获取数据库字段名 // 3.x支持lambda表达式
                .setEntityColumnConstant(false)
                // 逻辑删除属性名称
                //.setLogicDeleteFieldName("is_delete")
                // .entityTableFieldAnnotationEnable(true);
                .setEntityTableFieldAnnotationEnable(true);


        // 包信息配置
        PackageConfig packageConfig = new PackageConfig()
                .setParent(packageName)
                //控制层包名
//                .setController("")
                //实体包名
                .setEntity("pojo")
                //mapper包名
                .setMapper("dao")
                //xml包名
                .setXml("mapper")
                .setService("service")
                .setServiceImpl("service.impl")
                /*
                // 共同构建成包名
                .setParent("com.fengwenyi")
                .setModuleName("model")
                */;

        // 执行器
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }
}

