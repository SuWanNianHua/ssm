layui.use(['table', 'layer', 'jquery'], function () {
  var table = layui.table
  var layer = layui.layer
  var $ = layui.jquery

  // 模拟点击搜索后由 ajax 请求得到的数据
  $('#searchIpt').click(function () {

    data = {
      //表格里填充的数据
      tableData: [{
        "userAccount": 165168461561,
        "userName": "王大锤",
        "userId": "411381199884681549",
        "freezeMoney": "10000.00",
        "balance": "30000.00",
        "acountType": "活期",
        "acountStatus": "正常",
        "operate": {
          "freezeAct": 0,
        },
      },{
          "userAccount": 165168461561,
          "userName": "王大锤",
          "userId": "411381199884681549",
          "freezeMoney": "10000.00",
          "balance": "30000.00",
          "acountType": "活期",
          "acountStatus": "正常",
          "operate": {
            "freezeAct": 0,
          },
        }]
    }

    table.render({
      elem: '#show',
      page: true //开启分页
        ,
      cols: [
          [ //表头
            {
              field: 'userAccount',
              title: '账号',
              width: '12%',
              sort: true,
            }, {
              field: 'userName',
              title: '姓名',
              width: '8%',
            }, {
              field: 'userId',
              title: '身份证号',
              width: '17%',
              sort: true
            }, {
              field: 'freezeMoney',
              title: '冻结金额',
              width: '9%',
              sort: true,
              align: 'right'
            }, {
              field: 'balance',
              title: '余额',
              width: '9%',
              sort: true,
              align: 'right',
            }, {
              field: 'acountType',
              title: '账户类型',
              width: '9%',
            }, {
              field: 'acountStatus',
              title: '账户状态',
              width: '9%',
            }, {
              field: 'operate',
              title: '操作',
              width: '27%',
              toolbar: '#ipts'
            }
          ]
        ]

        // 在本地模拟数据
        ,
      data: data.tableData
    })

    table.on('tool(show)', function (obj) {
      var event = obj.event
      var that = $(this)
      
      if (event === 'freezeMey') {
        layer.confirm('<input type="text" id="freezedmoney">', {
          title: '请输入冻结金额'
        }, function (index) {
          var money = Number.parseFloat($('#freezedmoney').val())
          var freezeMoney = Number.parseFloat(obj.data.freezeMoney)
          var balance = Number.parseFloat(obj.data.balance)
          if (money <= balance) {
            balance = new String(balance - money)
            freezeMoney = new String(freezeMoney + money)
            obj.update({
              balance: balance,
              freezeMoney: freezeMoney
            })
            layer.msg('冻结成功')
          } else {
            layer.msg('您输入的数据格式不正确，或冻结金额大于余额')
          }
        })
      }

      if (event === 'freezeAct') {
        if (that.siblings('a').hasClass('layui-btn-disabled')) {
          layer.confirm('请确认为账户解冻', function (index) {
            that.siblings('a').toggleClass('layui-btn-disabled')
            that.html('冻结账户')
            layer.close(index)
          })
        } else {
          layer.confirm('请确认冻结账户', function (index) {
            that.siblings('a').toggleClass('layui-btn-disabled')
            that.html('账户解冻')
            layer.close(index)
          })
        }
      }

      if (event === 'changePwd') {
        layer.confirm('请输入新密码:<input type="password">', {
          title: '修改密码'
        }, function (index) {
          layer.close(index)
          layer.msg('修改密码成功')
        })
      }
      if (event === 'loss') {
        if (that.siblings('a').hasClass('layui-btn-disabled')) {
          layer.confirm('请确认为账户解除挂失', function (index) {
            that.siblings('a').toggleClass('layui-btn-disabled')
            that.html('挂失')
            layer.close(index)
          })
        } else {
          layer.confirm('请确认挂失账户', function (index) {
            that.siblings('a').toggleClass('layui-btn-disabled')
            that.html('解挂')
            layer.close(index)
          })
        }
      }
      if (event === 'get') {
        layer.confirm('请输入凭证码:<input type="text">', {
          title: '补发'
        }, function (index) {
          layer.close(index)
          layer.msg('验证成功')
        })
      }
      if (event === 'del') {
        layer.confirm('确认注销账户？', function (index) {
          obj.del()
          layer.close(index)
        })
      }
    })

  })

})