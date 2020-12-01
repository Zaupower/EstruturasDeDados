using Microsoft.AspNetCore.SignalR;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SignalRChat.Hubs
{
    public class ChatHub : Hub
    {

        public async Task AddToGroup(string groupName, string user)
        {
            await Groups.AddToGroupAsync(Context.ConnectionId, groupName);

            await Clients.Group(groupName).SendAsync("EnteredOrLEft",
                $"{Context.ConnectionId} has" +
                $" joined the group");
        }

        public async Task RemoveFromGroup(string groupName, string user)
        {
            await Groups.RemoveFromGroupAsync(Context.ConnectionId, groupName);

            await Clients.Group(groupName).SendAsync("EnteredOrLEft",
                $"{Context.ConnectionId} has" +
                $" left the group");
        }


        public async Task SendMessageGroup(string groupName, string user, string message)
        {

            await Clients.Group(groupName).SendAsync("ReceiveGroupMessage", user, message);

        }

        public async Task TypingGroup(string groupName, string user)
        {
            await Clients.Group(groupName).SendAsync("TypingMessage", user);
        }

        public async Task SendMessage(string user, string message)
        {
            await Clients.All.SendAsync("ReceiveMessage", user, message);
        }
        public async Task Typing(string user)
        {
            await Clients.All.SendAsync("TypingMessage", user);
        }
    }
}
