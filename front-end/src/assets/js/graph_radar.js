var echarts = require("echarts");

export default {
    paint: function (data,radarID){
        var myChart = echarts.init(document.getElementById(radarID));
        //myChart.showLoading();

        var json = data.radar;
    
        var option = {
        // title: {
        //     text: '竞争力'
        // },
        tooltip: {},
        legend: {
            data: ['本公司', '平均值'],
            top: 'bottom'
        },
        toolbox: {
                show: true,
                feature: {
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    },
                    dataView: {
                        show: true
                    }
                }
            },
        radar: {
            // shape: 'circle',
            name: {
                textStyle: {
                    color: '#fff',
                    backgroundColor: '#999',
                    borderRadius: 3,
                    padding: [3, 5]
                }
            },
            indicator: [
                // { name: '盈利能力'},
                // { name: '偿债能力'},
                // { name: '成长能力'},
                // { name: '营运能力'},
                // { name: '现金流量分析'}
                { name: '营业总收入'},
                { name: '营业总成本'},
                { name: '营业利润'},
                { name: '利润总额'},
                { name: '净利润'}
            ]
        },
        series: [{
            // name: '预算 vs 开销（Budget vs spending）',
            type: 'radar',
            // areaStyle: {normal: {}},
            data: [
                {
                    // value: [4300, 10000, 28000, 35000, 50000],
                    value: json.company,
                    name: '本公司',
                    label: {
                        show: true
                    },
                },
                {
                    // value: [5000, 14000, 28000, 31000, 42000],
                    value: json.avg,
                    name: '平均值',
                    areaStyle: {
                            // opacity: 0.9,
                            color: new echarts.graphic.RadialGradient(0.5, 0.5, 1, [
                                {
                                    color: '#B8D3E4',
                                    offset: 0
                                },
                                {
                                    // color: '#72ACD1',
                                    color: '#fff',
                                    offset: 1
                                }
                            ])
                    }
                }
            ]
        }]
    };
    
    
        myChart.setOption(option);
    }
}